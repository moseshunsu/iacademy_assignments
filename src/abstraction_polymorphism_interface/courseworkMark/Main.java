package abstraction_polymorphism_interface.courseworkMark;

public class Main {
    public static void main(String[] args) {

        CourseworkMark java = new CourseworkMark(20, 20, 60);
        Course javaCourse = new Course(java, "Java");

        System.out.println(javaCourse);
    }
}
