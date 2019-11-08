//Andrew Young
//3.10

import java.util.Random;
import java.util.Scanner;


public class HiLo {
    public static void main(String[] args) {
        
		Random number = new Random();
        int num = number.nextInt(100) + 1;
        int counter = 0;
        int guess = 1;
        
        
        while (num != guess && counter < 10 && guess != 0) {
        	Scanner input = new Scanner(System.in);
            System.out.println("Guess a number between 1 and 100 (or enter '0' to exit): ");
            String prompt = input.nextLine();
            guess = Integer.parseInt(prompt);
            if (guess != 0) {
            	counter = counter + 1;
            	if (num == guess) {
            		System.out.println("Correct! The number was " + num + ".\n\nGuess count: " + counter);
            	} else if (guess > 100 || guess < 1) {
            		System.out.println("Error: Enter a number ranging from 1 to 100.");
            		counter = counter - 1;
            	} else if (guess > num) {
            		System.out.println("Too high. Guess again.\n\nGuess count: " + counter);
            	} else if (guess < num) {
            		System.out.println("Too low. Guess again.\n\nGuess count: " + counter);
            	}
            	else {
            		input.close();
            	}
            }
        }
        
    }
}
