//Andrew Young
//Assignment 3.5
import javax.swing.JOptionPane;


public class ShowMeMoreMoney {

	public static void main(String[] args) {
		String textIn = JOptionPane.showInputDialog("Enter an amount of change in ¢: ");
		int input = Integer.parseInt(textIn); //Put the amount of change in a variable
		int hundreds = input / 10000; 
		int changeH = input % 10000; 
		int tens = changeH / 1000; 
		int changeT = changeH % 1000; 
		int dollar = changeT / 100; 
		int changeD = changeT % 100; 
		int quarters = changeD / 25; 
		int changeQ = changeD % 25; 
		int dimes = changeQ / 10; 
		int changeDi = changeQ % 10; 
		int nickels = changeDi / 5; 
		int changeN = changeDi % 5; 
		int pennies = changeN; 
		String hundred, ten, dollars, quarter, dime, nickel, penny;
		if (hundreds != 1) { //Check if the amount is one
			hundred = hundreds + "    Hundreds\n"; //plural
		} else {
			hundred = hundreds + "    Hundred\n"; //singular
		}
		if (tens != 1) {  
			ten = tens + "    Tens\n";  
		} else {
			ten = tens + "    Ten\n";  
		}
		if (dollar != 1) {  
			dollars = dollar + "    Dollars\n";  
		} else {
			dollars = dollar + "    Dollar\n";  
		}
		if (quarters != 1) {  
			quarter = quarters + "    Quarters\n";  
		} else {
			quarter = quarters + "    Quarter\n";  
		}
		if (dimes != 1) {  
			dime = dimes + "    Dimes\n";  
		} else {
			dime = dimes + "    Dime\n";  
		}
		if (nickels != 1) {  
			nickel = nickels + "    Nickels\n";  
		} else {
			nickel = nickels + "    Nickel\n";  
		}
		if (pennies != 1) {  
			penny = pennies + "    Pennies\n";  
		} else {
			penny = pennies + "    Penny\n";  
		}
		//whew. the output
		JOptionPane.showMessageDialog(null, "Your change is: \n" + hundred + ten + dollars + quarter + dime + nickel + penny);
	}

}