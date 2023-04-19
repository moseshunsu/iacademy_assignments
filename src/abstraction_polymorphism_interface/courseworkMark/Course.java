package abstraction_polymorphism_interface.courseworkMark;

public class Course {
    private CourseworkMark courseworkMark;
    private String courseTitle;

    public Course(CourseworkMark courseworkMark, String courseTitle) {
        this.courseworkMark = courseworkMark;
        this.courseTitle = courseTitle;
    }

    public CourseworkMark getCourseworkMark() {
        return courseworkMark;
    }

    public void setCourseworkMark(CourseworkMark courseworkMark) {
        this.courseworkMark = courseworkMark;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    @Override
    public String toString() {
        return "{CourseTitle=" + courseTitle + "\n" +
                courseworkMark +
                '}';
    }
}
