//Andrew Young
//Assignment 5.5 - RedRum
//5/3/19

import javax.swing.JOptionPane;

public class RedRum {

	public static void main(String[] args) {
		String promptInput = JOptionPane.showInputDialog("Please enter your name:  "); //gets input
		int lengthOf = promptInput.length();// gets length of input
		String returnur = "";//initializes variable and sets it to empty for first for loop
		for (int i = lengthOf; i > 0 ; i--) { //for loop that decreases from length of input to 0
			returnur = returnur + promptInput.substring(i-1, i); //each time it loops, it adds the previous letter from the name
			
		}
		JOptionPane.showMessageDialog(null, "The name " + promptInput + " would be: " + returnur.toLowerCase());//outputs the name backwords and makes it lowercase
	}

}
