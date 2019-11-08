
public class CashierTester {
	public static void main(String[] args) {
		Cashier bob = new Cashier();
		bob.setAmountDue(10.11);
		System.out.println("Amount Due: $" + (bob.getAmountDue())); // Amount Due: $10.11
		System.out.println("Customer gave a $20");
		System.out.println("Change: $" + (bob.receive(20))); // Change $9.89
		System.out.println();
		System.out.println("Dollars: " + (bob.returnDollars())); // Dollars: 9
		System.out.println("Quarters: " + (bob.returnQuarters())); // Quarters: 3
		System.out.println("Dimes: " + (bob.returnDimes())); // Dimes: 1
		System.out.println("Nickels: " + (bob.returnNickels())); // Nickels: 0
		System.out.println("Cents: " + (bob.returnCents())); // Pennies: 4
	}
}
