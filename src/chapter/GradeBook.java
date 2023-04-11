package chapter;

import java.util.Arrays;

public class GradeBook {
        private String courseName;
        private int[] grades;

        public GradeBook(String courseName, int[] grades) {
            this.courseName = courseName;
            this.grades = grades;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public String getCourseName() {
            return courseName;
        }
//    public int getMinimumGrade(){
//        int lowest= Integer.MAX_VALUE;
//        for (int grade:grades){
//            if (grade<lowest){
//                lowest=grade;
//            }
//        }
//        return lowest;
//    }

        /**
         * A more simple approach to the above will be to use sort method, then you pick the first element.
         * Arrays.sort(grades);
         * return grades[0];
         */
        public int getMinimumGrade() {
            Arrays.sort(grades);
            return grades[0];
        }

        public int getMaximumGrade() {
            int highest = Integer.MIN_VALUE;
            for (int grade : grades) {
                if (grade > highest) {
                    highest = grade;
                }
            }
            return highest;
        }

        public float getAverage() {
            int sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            return sum / grades.length;
        }

        public void outPutGrades() {
            for (int i = 0; i < grades.length; ++i) {
                System.out.printf("Student %d grade; %d%n", i + 1, grades[i]);
            }
        }

        public void gradeSummary() {
            System.out.printf("""
                    Course Name: %s
                    Lowest Grade: %d
                    Highest Grade: %d
                    Average Grade: %.2f
                    """, getCourseName(), getMinimumGrade(), getMaximumGrade(), getAverage());
        }
}
