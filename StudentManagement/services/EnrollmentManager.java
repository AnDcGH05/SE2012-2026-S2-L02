package services;

import models.Student;
import models.Course;

/**
 * Manages student enrollments and operations.
 */
public class EnrollmentManager {

    /**
     * Searches for a student by ID.
     * @param students array of students
     * @param count total number of current students
     * @param id student ID to search for
     * @return Student object if found, otherwise null
     */
    public Student searchStudentById(Student[] students, int count, String id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId().equalsIgnoreCase(id)) {
                return students[i];
            }
        }
        return null;
    }

    /**
     * Sorts students alphabetically by name using bubble sort.
     * @param students array of students
     * @param count number of students in the array
     */
    public void sortStudentsByName(Student[] students, int count) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (students[j].getName().compareToIgnoreCase(students[j + 1].getName()) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}