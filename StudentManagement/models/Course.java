package models;
/**
 * Represents a course with a code and a title.
 */
public class Course {
    private String code;
    private String title;

    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }

    /**
     * Gets the course code.
     * @return course code
     */
    public String getCode() {
        return code;
    }

    /**
     * Gets the course title.
     * @return course title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns course details.
     * @return course details as a string
     */
    public String toString() {
        return "Code: " + code + ", Title: " + title;
    }
}