import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        int maxAttempts = 10;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between " + lowerBound + " and " + upperBound + ".");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == targetNumber) {
                hasGuessedCorrectly = true;
                break;
            } else if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        if (hasGuessedCorrectly) {
            System.out.println("Congratulations! You guessed the number " + targetNumber + " correctly in " + attempts + " attempts.");
        } else {
            System.out.println("Sorry! You've reached the maximum number of attempts. The correct number was: " + targetNumber);
        }

        scanner.close();
    }
}

