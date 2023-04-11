package assignment;

import java.util.Scanner;

public class ReversingDigits {

    public static StringBuilder reversedDigits(int var) {
        StringBuilder reversedDigit = new StringBuilder();
        while (var > 0) {
            reversedDigit.append(var % 10);
            var /= 10;
        }
        return reversedDigit;
    }

    public static void displayReversedDigits() {
        Scanner input = new Scanner(System.in);
        System.out.println("Kindly enter the digit you want to reverse: ");

        int var = input.nextInt();
        System.out.println("\nThe reversed digit is: " + reversedDigits(var));
    }

    public static void main(String[] args) {
//        System.out.println(reversedDigits(7631));
//        System.out.println(reversedDigits(76310));
        displayReversedDigits();
    }
}
