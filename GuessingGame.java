package numsys;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        
        // Option for multiple rounds
        String playAgain;
        do {
            int attempts = 10;
            int numberToGuess = random.nextInt(100) + 1;
            int guess = 0;
            
            System.out.println("I have generated a random number between 1 and 100.");
            System.out.println("You have " + attempts + " attempts to guess it.");
            
            // Game loop
            while (attempts > 0 && guess != numberToGuess) {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                
                if (guess < numberToGuess) {
                    System.out.println("Too low! Try a higher number.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high! Try a lower number.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number: " + numberToGuess);
                    score++;
                }
                attempts--;
            }
            
            if (guess != numberToGuess) {
                System.out.println("You've run out of attempts! The number was: " + numberToGuess);
            }
            
            System.out.println("Your score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next();
            
        } while (playAgain.equalsIgnoreCase("yes"));
        
        System.out.println("Thank you for playing! Your final score: " + score);
        scanner.close();
    }
}

