package controlStructuresAndLoops;

import java.util.Scanner;

public class collegeStudentsClassExercise {

    public static void main (String[] args) {
        int numberOfStudents = 1;
        int passesCount = 0;
        int failsCount = 0;
        int input;
        Scanner scanner = new Scanner(System.in);

        while (numberOfStudents <= 10) {
            System.out.printf("Enter student%d's test result:\n", numberOfStudents);
            input = scanner.nextInt();
            if (input == 1) {
                passesCount++;
                numberOfStudents++;
            } else if (input == 2) {
                failsCount++;
                numberOfStudents++;
            } else {
                System.out.println("You typed a wrong input!!!\n");
            }
        }

        if (passesCount > 8) {
            System.out.println("Bonus to instructor!");
        }

        System.out.printf("""
                Number of student(s) who passed: %d.
                Number of student(s) who failed: %d.
                
                """, passesCount, failsCount);

    }
}
