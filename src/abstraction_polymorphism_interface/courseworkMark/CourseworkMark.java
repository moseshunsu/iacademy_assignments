package abstraction_polymorphism_interface.courseworkMark;

public class CourseworkMark {
    private double quiz;
    private double test;
    private double project;

    public CourseworkMark(double quiz, double test, double project) {
        this.quiz = quiz;
        this.test = test;
        this.project = project;
    }

    public double getQuiz() {
        return quiz;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public double getTest() {
        return test;
    }

    public void setTest(double test) {
        this.test = test;
    }

    public double getProject() {
        return project;
    }

    public void setProject(double project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "CourseworkMark{" +
                "quiz=" + quiz +
                ", test=" + test +
                ", project=" + project +
                '}';
    }
}
