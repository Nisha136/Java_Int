//Task 1: Number Guessing Game
import java.util.Random;
import java.util.Scanner;

public class NumGuess {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        while (true) {
            System.out.println("Enter your guess from 1-100: ");

            Scanner scan = new Scanner(System.in);
            int playerGuess = scan.nextInt();
            if (playerGuess == randomNumber) {
                System.out.println("Correct! You won!");
                break;
            } else if (randomNumber > playerGuess) {
                System.out.println("Sorry! The number is greater, guess again.");
            } else {
                System.out.println("Sorry! The number is smaller, guess again.");
            }
        }
    }

}