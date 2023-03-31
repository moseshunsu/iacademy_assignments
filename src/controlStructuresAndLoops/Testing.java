package controlStructuresAndLoops;
import java.util.Scanner;


public class Testing {
    public static void displayGradeUsingIf() {
        int score = 40;

        if (score >= 80) {
            System.out.println("A");
        } else if (score >= 70) {
            System.out.println("B");
        } else if (score >= 60) {
            System.out.println("C");
        } else if (score >= 50) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

    public static String displayGradeUsingCase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a scare");
        int score = scanner.nextInt();
        String grade;

        switch (score / 10) {
            case 9, 8, 7:
                grade = "A";
                break;
            case 6:
                grade = "B";
                break;
            case 5:
                grade = "C";
                break;
            default:
                grade = "F";
        }
        System.out.println(grade);
        return grade;
    }

    public static void main(String[] args) {
        displayGradeUsingIf();
        displayGradeUsingCase();
    }
}
