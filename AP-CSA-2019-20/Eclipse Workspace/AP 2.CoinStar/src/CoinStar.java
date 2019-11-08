import java.util.Scanner;

//Andrew Young
//Coin Counter


public class CoinStar {

	public static void main(String[] args) {
		Scanner inputscan = new Scanner(System.in);
		System.out.println("Enter an amount of change in ¢: ");
		int input = inputscan.nextInt();
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
		if (hundreds != 1) { 
			hundred = hundreds + "    Hundreds\n"; 
		} else {
			hundred = hundreds + "    Hundred\n"; 
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
		inputscan.close();
		System.out.println("Your change is: \n" + hundred + ten + dollars + quarter + dime + nickel + penny);
	}

}