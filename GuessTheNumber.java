import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        	Scanner input = new Scanner(System.in);	
		Random rand = new Random();
		int lowerBound = 0;
		int upperBound = 0;
	    	System.out.println("Welcome to Guess the Number!");
        	System.out.print("Enter a Lowerbound: ");
		lowerBound=input.nextInt();
		System.out.print("Enter a Upperbound: ");
		upperBound=input.nextInt();
		int numberToGuess = rand.nextInt(upperBound - lowerBound + 1) + lowerBound;
        	int attempts = 0;
		int score=100;

        
        System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound);

        while (true) {
            System.out.print("Enter your guess: ");
            int userGuess = input.nextInt();
            attempts++;

            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
			   System.out.println("Your score is: " + score);
                break;
            } else if (userGuess < numberToGuess) {
                System.out.println("Try higher.");
            } else {
                System.out.println("Try lower.");
            }
			score -= 10;
			if(attempts >= 10){
				System.out.println("Game Over! The number was " +numberToGuess);
				System.out.println("Your score is: " + score);
				System.out.println("Better luck next time");
				input.close();
                 break;
			}
        }

        
    }
}
