import javax.swing.JOptionPane;

public class TicketNumber {

	public static void main(String[] args) {
		
		while(true) {
			String promptInput = JOptionPane.showInputDialog("Welcome to HubStub!\nPlease Enter your ticket number. "); //gets input
		    //    int fullTicketNum = Integer.parseInt(promptInput);			//not neccesary
		        int length = String.valueOf(promptInput).length();//makes sure its 6 long
		        if (length == 6) {
		        	//ticket length is good
		        	String short5 = promptInput.substring(0,5); //shortents it to first 5
		        //	System.out.println("5 digit: " + short5);
		        	
		        	//remainder part
		        	//get last num
		        	String lastNum = promptInput.substring(5,6); //gets lsat digit
		        	//System.out.println("Last num: " + lastNum); 
		        	int lastNumInt = Integer.parseInt(lastNum);
		        	int short5Int = Integer.parseInt(short5);
		        	int remainder = short5Int % 7; //deos the remainder check
		        //	System.out.println("Remainder: " + remainder);
		        	if (lastNumInt == remainder) {
		        		JOptionPane.showMessageDialog(null, promptInput + " is a Valid Ticket");
		        	} else {
		        		JOptionPane.showMessageDialog(null, promptInput + " is not a Valid Ticket");

		        	}
		        	
		        	
		        } else {
		        	//ticket num not good
		        	JOptionPane.showMessageDialog(null, "Error. Enter a six digit code");
		        }

			}
		}
		


}
