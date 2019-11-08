//Andrew Young
//Assignment 10 - ChaCing
public class Cashier {

	private double amountRec, amountDue, change;
	private int dollar, quarter, dime, nickel, cent; 
	
	
	public Cashier() {
		amountRec = 0.0;
		amountDue = 0.0;
		change = 0.0;
		dollar = 0; //initializes variables as default (0)
		quarter = 0;
		dime = 0;
		nickel = 0;
		cent = 0;
	}
	
	public Cashier(double rec, double due, double chg, int dolla, int qu, int di, int ni, int ce) {
		amountRec = rec;//  \
		amountDue = due;//   \
		change = chg;//		  \
		dollar = dolla;//    sets defaults to parameters instead
		quarter = qu;//	 	  /
		dime = di;//	     /
		nickel = ni;//      /
		cent = ce;//       /
	}
	
	void setAmountDue(double in) {
		amountDue = in; // sets amount due
	}
	
	double getAmountDue() {
		return amountDue; //returns amount due
	}
	
	double receive(double in) {
		amountRec = in;
		change = amountRec - amountDue; //subtracts to get change
		return change; // returns change
	}
	
	int returnDollars() {
		change *= 100; //converts to cents
		dollar = (int) (Math.floor(change)/100); //converts to int and rounds down while going back to dollar form
		change = change % 100; //gets rid of each dollar
		return dollar;
	}
	
	int returnQuarters() {
	
		quarter = (int) (Math.floor(change)/25); //int convert
		change = change % 25; //gets rid of quarters
		return quarter;
	}
	
	int returnDimes() {
		
		dime = (int) (Math.floor(change)/10); //int convert
		change = change % 10;// gets rid of dimes
		return dime;
	}
	
	int returnNickels() {
		
		nickel = (int) (Math.floor(change)/5);// int convert
		change = change % 5;//gets rid of nickels
		return nickel;
	}
	
	
	int returnCents() {
		cent = (int) (Math.floor(change)); //int convert
		return cent;//returns cents
	}
	
	
	
}
