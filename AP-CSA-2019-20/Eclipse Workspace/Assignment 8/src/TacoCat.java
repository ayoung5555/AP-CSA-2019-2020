import javax.swing.JOptionPane;

public class TacoCat {

	public static void main(String[] args) {
		//outside while loop
		//defining variables
		String promptInput = "";
		String strReverse = "";
		int lengthOfInput = 0;
		boolean continueq = false;
		boolean wholeprogcont = true;
		
		while(wholeprogcont) {
		//inside while loop
		promptInput = JOptionPane.showInputDialog("Enter a palindrome to see if its acgtually a palindrome ").toLowerCase(); //original input to lowercase
        
		promptInput = promptInput.replace(" ", ""); //removes space
		promptInput = promptInput.replace(".", ""); //removes other stuff below
		promptInput = promptInput.replace(",", "");
		promptInput = promptInput.replace("?", "");
		
		//System.out.println("Reduced:	" + promptInput); //console
		strReverse = ""; //sets base value for reverse
		lengthOfInput = promptInput.length(); //gets length of input
		for(int i = lengthOfInput; i>0; i--) {
			strReverse = strReverse + promptInput.substring(i - 1, i); //reverses the string
		}
		//System.out.println("Reverse:	" + strReverse); //console
		if(strReverse.equals(promptInput)) {
			//System.out.println(promptInput + " is a palindrome!");
			JOptionPane.showMessageDialog(null, promptInput + " is a palindrome!"); //outputs IS palindrome
			
		} else {
			//System.out.println(promptInput + " is not a palindrome!");
			JOptionPane.showMessageDialog(null, promptInput + " is not a palindrome!"); //outputs NOT palindrome
		}
		
		
		
		
		continueq = true;
		while(continueq == true) {
				
			String continueQ = JOptionPane.showInputDialog("Enter 'Y' to test another word or 'X' to exit");
			if((continueQ.toLowerCase().equals("y"))) {
				//continue input is valid
				
					continueq = false; //when user types Y then continue while loop
					wholeprogcont = true;
					//System.out.println("y");
			}	else if (continueQ.toLowerCase().equals("x")) {
					continueq = false;
					wholeprogcont = false;
				    //System.out.println("x"); //when user types X then end while loops
				   
				} else {
				continueq = true;
				//System.out.println("Input not valid. Enter 'Y' or 'X' please.");
				JOptionPane.showMessageDialog(null, "Input not valid. Enter 'Y' or 'X' please."); //tells user when they dont enter y or x
				//continue input not valid
			}
		}
	}
		//System.out.println("exit"); 
		System.exit(0); //exits program
}
	

}
