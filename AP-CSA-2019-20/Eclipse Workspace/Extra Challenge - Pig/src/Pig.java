import java.util.Random;

import javax.swing.JOptionPane;

public class Pig {
	
	
	
	public int playerPoints, compPoints, maxBet, randRoll, who;
	//Player who=0
	String PlayerTurn() {
		who = 0;
		String promptInput = JOptionPane.showInputDialog("Player Turn. Pick 'R' to roll or 'H' to hold."); //gets input
		if(promptInput.toLowerCase().equals("r")) {
			RollDice(who);
			//if statements for roll num
			if(randRoll == 1) {
				playerPoints = 0;
			} else {
				playerPoints += randRoll;
				
			}
			return "You rolled a " + Integer.toString(randRoll) + " and your new score is " + Integer.toString(playerPoints);
		} else if(promptInput.toLowerCase().equals("h")) {
			return "hi";
		} else {
			JOptionPane.showMessageDialog(null, "Input not valid. Please Type 'R' or 'H' to roll or hold.");
			PlayerTurn();
			return "error";
		}
		
		
		
		
		
		
	}
	//Player cpu=1
	void ComputerTurn() {
		who = 1;
		System.out.println("CPU: ");
		RollDice(who);
	}
	
	void RollDice(int who) {
		Random rand = new Random();
		randRoll = rand.nextInt(6) + 1;
		System.out.println(randRoll);	
	}
	
}
