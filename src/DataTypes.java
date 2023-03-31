import java.util.Scanner;
public class DataTypes {
    public static void main (String[] args) {
        int firstNumber;
        int secondNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        firstNumber = scanner.nextInt();

        System.out.printf("Enter your second number: ");
        secondNumber = scanner.nextInt();

        int result = firstNumber + secondNumber;
        System.out.print("The sum is " + result + ".");

    }
}
