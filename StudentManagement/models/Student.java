package models;
/**
 * Represents a student with an ID and a name.
 */
public class Student {
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Gets the student ID.
     * @return student ID
     */
    public String getId() {
        return id;
    }

    /**
     * Gets the student name.
     * @return student name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns student details.
     * @return student details
     */
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}