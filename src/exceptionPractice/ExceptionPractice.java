package exceptionPractice;

import java.util.Scanner;

public class ExceptionPractice {

    public static double quotient(int numerator, int denominator) {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        System.out.println("Welcome");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter another number: ");
        int num2 = scanner.nextInt();
        try {
            System.out.println(quotient(num1, num2));
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("Thanks for using this system");
    }
}
