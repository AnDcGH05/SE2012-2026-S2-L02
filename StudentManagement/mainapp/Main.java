package mainapp;

import models.Course;
import models.Student;
import services.EnrollmentManager;

import java.util.Scanner;

/**
 * Main application class handling user menu interaction.
 */
public class Main {

    /**
     * Main application entry point.
     * @param args command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[100];
        int studentCount = 0;

        EnrollmentManager em = new EnrollmentManager();

        int choice;

        do {
            System.out.println("\n--------Student Management--------");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. List Students");
            System.out.println("4. Search Student");
            System.out.println("5. Sort Students");
            System.out.println("6. Exit");

            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    if (studentCount < students.length) {

                        System.out.print("Enter Student ID: ");
                        String id = sc.nextLine();

                        System.out.print("Enter Student Name: ");
                        String name = sc.nextLine();

                        students[studentCount] = new Student(id, name);
                        studentCount++;

                        System.out.println("Student added Successfully.");

                    } else {
                        System.out.println("Student list is full.");

                    }

                    break;

                case 2:
                    System.out.print("Enter Course Code: ");
                    String code = sc.nextLine();

                    System.out.print("Enter Course Title: ");
                    String title = sc.nextLine();

                    Course course = new Course(code, title);

                    System.out.println("\nCourse Created Successfully.");
                    System.out.println(course);

                    break;

                case 3:

                    if (studentCount == 0) {
                        System.out.println("No students available.");

                    } else {

                        System.out.println("\nStudent List");

                        for (int i = 0; i < studentCount; i++) {
                            System.out.println(students[i]);
                        }

                    }
                    break;

                case 4:
                    System.out.print("Enter Student ID: ");
                    String sID = sc.nextLine();

                    Student s = em.searchStudentById(students, studentCount, sID);

                    if (s != null) {
                        System.out.println("Student Found:");
                        System.out.println(s);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    if (studentCount > 1) {
                        em.sortStudentsByName(students, studentCount);
                        System.out.println("Students sorted successfully.");

                    } else {

                        System.out.println("Not enough students to sort.");

                    }
                    break;

                case 6:
                    System.out.println("Exiting...");

                    break;

                default:
                    System.out.println("Invalid choice.");

            }

        } while (choice != 6);

        sc.close();
    }
}