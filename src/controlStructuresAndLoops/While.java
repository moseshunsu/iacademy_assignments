package controlStructuresAndLoops;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        int studentCounter = 1;
        int score;
        double classAverage;
        int totalScore = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter student %d's score \n", studentCounter);
        score = scanner.nextInt();
        totalScore += score;

        while (studentCounter < 10) {
            studentCounter++;
            System.out.printf("Enter student %d's score\n", studentCounter);
            score = scanner.nextInt();
            totalScore += score;
            System.out.println("total score is " + totalScore);
        }

        classAverage = (double) totalScore / studentCounter;
        System.out.println(classAverage);
    }
}
