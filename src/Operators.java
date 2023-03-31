import java.util.Scanner;

public class Operators {

    public static void main (String [] args) {
        int firstNumber;
        int secondNumber;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        firstNumber = input.nextInt();

        System.out.print("Enter your second number: ");
        secondNumber =  input.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("Both numbers are equal");
        }
        if (firstNumber != secondNumber) {
            System.out.println("Both numbers are not equal");
        }
        if (firstNumber > secondNumber) {
            System.out.println("First number is greater");
        }
        if (firstNumber < secondNumber) {
            System.out.println("Second number is greater");
        }
    }
}
