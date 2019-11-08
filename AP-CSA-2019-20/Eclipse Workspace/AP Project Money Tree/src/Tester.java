//Andrew Young
//Tester.java
//MoneyTree


import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		
		System.out.println("Enter money amount: ");
		Scanner in = new Scanner (System.in);
		double initialMoney = in.nextDouble(); //takes in initial money amount
		System.out.println("Enter account name: ");
		String a = in.nextLine(); //accepts enter key
		String accountName = in.nextLine();
		in.close(); //closes scanner
		BankAccount myAccount = new BankAccount(initialMoney, accountName); //creates new BankAccount object
		System.out.println(myAccount.balance());
		myAccount.deposit(815.22);
		System.out.println(myAccount.balance()); //each of runs the balance method which returns the balance
		myAccount.withdraw(100.00);
		System.out.println(myAccount.balance());
		
	}

}
