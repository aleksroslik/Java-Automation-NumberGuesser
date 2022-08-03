package Week1;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberToGuess = new Random().nextInt(100);
        int numberOfGuesses = 5;
        int guess = 0;

        System.out.println("Hello! What is your name?");
        String name = input.nextLine();
        System.out.println("Let's play a game " + name + " :)");

        System.out.println("Can you guess a number between 0 and 99? Enter your guess below:");

        while (guess != numberToGuess) {
            numberOfGuesses--;
            guess = input.nextInt();
            if (guess == numberToGuess) {
                System.out.println("You guessed it!");
                break;
            }
            if (guess > numberToGuess) {
                System.out.println("Your number is GREATER than the one you are trying to guess");
                System.out.println("Try again! You have " + numberOfGuesses + " rounds to go :)");
            }
            if (guess < numberToGuess) {
                System.out.println("Your number is LOWER than the one you are trying to guess");
                System.out.println("Try again! You have " + numberOfGuesses + " rounds to go :)");
            }
            if (numberOfGuesses == 0) {
                System.out.println("Sorry you didn't guess the number, the answer was: " + numberToGuess);
                //input.close();
            }
        }
    }
}
