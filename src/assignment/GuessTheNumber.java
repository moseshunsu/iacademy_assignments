package assignment;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumber {

    public static void guessGame() {
        SecureRandom random = new SecureRandom();
        Scanner scanner = new Scanner(System.in);

        int randomInteger = random.nextInt(1000) + 1;
        int guess = 0;
        System.out.println(randomInteger);
        System.out.println("Guess a number between 1 and 1000: ");

        while (guess != randomInteger) {
            guess = scanner.nextInt();

            if (guess > randomInteger) {
                System.out.println("Too high. Try again.");
            } else if (guess < randomInteger) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Congratulations. You guessed the number!");
            }
        }

        System.out.println("""
        
        Do you want to play again? Enter '1' to play again or enter any other character to exit.""");
        int toContinue = scanner.nextInt();

        if (toContinue == 1) {
            guessGame();
        } else System.out.println("Good Luck!!!");
    }

    public static void main(String[] args) {
        guessGame();
    }
}
