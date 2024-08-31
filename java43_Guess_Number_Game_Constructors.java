package com.jordanjava;

import java.util.Scanner;

class GuessNumberGame {
    private final int secretNumber;
    private int attempts;

    // Constructor to initialize the game
    public GuessNumberGame() {
        secretNumber = (int) (Math.random() * 100) + 1; // Generate a random number between 1 and 100
        attempts = 0;
    }

    // Method to play the game
    public void play() {
        Scanner scanner = new Scanner(System.in);
        int guess;

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it.");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            }
            else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            }
            else {
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
}
        } while (guess != secretNumber);

        scanner.close();
    }
}

public class java43_Guess_Number_Game_Constructors {
    public static void main(String[] args) {
        GuessNumberGame game = new GuessNumberGame();
        game.play();
    }
}
