//Andrew Young
//assignment 3.75
import java.util.Random;
import javax.swing.JOptionPane;

public class YouGotIt {
    public static void main(String[] args) {
        //generates random num
		Random number = new Random();
        int num = number.nextInt(300) + 1;
        int tenPlus = num + 10;
        int tenMinus = num - 10;
        int counter = 0;
        int guess = 0;
        JOptionPane.showMessageDialog(null, "Pick a number between 1 and 300, you have 10 chances to guess the number.\nIf you guess correctly in under 10 tries, you win! Otherwise, you lose.");
        while (num != guess && counter < 10) {
            String promptInput = JOptionPane.showInputDialog("Guess a number between 1 and 300.");
            guess = Integer.parseInt(promptInput);
            counter = counter + 1;
            if (num == guess) {
                JOptionPane.showMessageDialog(null, "Good Job! The number was " + num + ".\n\nGuess count: " + counter);
            } else if (num < guess && guess <= tenPlus) { // each of these checks the range
                JOptionPane.showMessageDialog(null, "Bro you were so close. Just a bit lower. Guess again.\n\nGuess count: " + counter);
            } else if (tenMinus <= guess && guess < num) {
                JOptionPane.showMessageDialog(null, "Nope, but you were pretty close. Guess higher this time..\n\nGuess count: " + counter);
            } else if (guess > 300 || guess < 1) {
                JOptionPane.showMessageDialog(null, "Hey! Didn't I tell you to input a number between 1 and 300? Well actually do it this time.");
                counter = counter - 1;
            } else if (guess > num) {
                JOptionPane.showMessageDialog(null, "Too high, buckeye. Guess again.\n\nGuess count: " + counter);
            } else if (guess < num) {
                JOptionPane.showMessageDialog(null, "Too low my bro. Guess again.\n\nGuess count: " + counter);
            }
        }
    }
}