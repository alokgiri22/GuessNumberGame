 # GuessNumberGame 
<br>

import java.util.Scanner;
class game{
    private int secretNumber;
    private int attempts;

    //Constructors for initializing the game...
    public game(){
        secretNumber = (int) (Math.random() * 100) + 1;
        attempts = 0;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int guess;

        System.out.println("Welcome to the game of Guess Number...");
        System.out.println("Guess the Secret number between 1-100 in least possible attempts...");

        // Loop for game rules...
        do {
            System.out.print("Enter your Guess : ");
            guess = scanner.nextInt(); // scanning of user input...
            attempts++ ;   // increment after every wrong guess ---> to show score at last

            // Conditions..
            if (guess > secretNumber) {
                System.out.println("oops... number you guessed is high... try again!!");
            } else if (guess < secretNumber) {
                System.out.println("oops... number you guessed is low... try again!!");
            } else {
                System.out.println("Hurray.. you guessed the right number...");
                System.out.println("Your Final Score as per your attempts is : " + attempts);
            }
        }
        while (guess != secretNumber);
        scanner.close(); // Closing the scanner keyword
    }
}
public class Game_of_GuessNumber {
    public static void main(String[] args) {
        game game = new game();
        game.play();

    }
}
