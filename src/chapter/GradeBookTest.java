package chapter;

public class GradeBookTest {
    public static void main(String[] args) {
        int[] grades={11, 55, 78, 67, 89, 90,44};
        GradeBook gradeBook=new GradeBook("Java", grades);
        gradeBook.gradeSummary();
    }
}
