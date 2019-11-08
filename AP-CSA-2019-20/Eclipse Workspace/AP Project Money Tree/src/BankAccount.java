//Andrew Young
//BankAccount.java
//MoneyTree

public class BankAccount {
	
	private double balance;
	private String name;
	
	BankAccount(double inBalance, String inName) {
		balance = inBalance;
		name = inName;
	}
	
	public void deposit(double moneyIn) {
		balance += moneyIn;
		balance = Math.floor(balance * 100) / 100;
	}
	
	public void withdraw(double moneyOut) {
		balance -= moneyOut;
		balance = Math.floor(balance * 100) / 100;
	}
	
	public String balance() {
		return "The " + name + " account balance is: $" + balance;
	}
}
