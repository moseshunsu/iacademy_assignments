import java.util.Scanner;

public class ClassExercise {

    public static void main (String[] args){
        int firstNumber, secondNumber, thirdNumber, lastNumber;
        int smallest = 0;
        int largest = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        firstNumber = input.nextInt();

        System.out.print("Enter your second number: ");
        secondNumber = input.nextInt();

        System.out.print("Enter your first number: ");
        thirdNumber = input.nextInt();

        int sum = firstNumber + secondNumber + thirdNumber;
        int average = (sum / 3);
        int product = (firstNumber * secondNumber * thirdNumber);

        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            smallest = firstNumber;
        }
        if (secondNumber < firstNumber && secondNumber < thirdNumber) {
            smallest = secondNumber;
        }
        if (thirdNumber < firstNumber && thirdNumber < secondNumber) {
            smallest = thirdNumber;
        }

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            largest = firstNumber;
        }
        if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            largest = secondNumber;
        }
        if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            largest = thirdNumber;
        }

        System.out.printf("Sum: %d\nAverage: %d\nProduct: %d\nSmallest: %d, Largest: %d\n", sum, average, product, smallest, largest);
//        System.out.println("Sum: " + sum);
//        System.out.println("Average: " + average);
//        System.out.println("Product: " + product);
//        System.out.println("Smallest: " + smallest);
//        System.out.println("Largest: " + largest);

        System.out.print("Enter number to check if it is an even or odd number: ");
        lastNumber = input.nextInt();
        if (lastNumber % 2 == 0) {
            System.out.println("The number is an Even Number.");
        }
        if (lastNumber % 2 != 0) {
            System.out.println("The number is an Odd Number.");
        }
    }
}
