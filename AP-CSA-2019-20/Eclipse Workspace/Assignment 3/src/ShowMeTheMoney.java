//import java.util.Scanner;
import javax.swing.JOptionPane;

// Andrew Young
// ShowMeTheMoney Assignment 3

public class ShowMeTheMoney {

	public static void main(String[] args) {
		/* OLD STUFF
		System.out.println("Hello! Welcome to ShowMeTheMoney");
		System.out.println("");
		// opens the scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter AN amount of change in ¢: ");
		int centInput = input.nextInt();
		*/
		//n NEW STUFF
		String centInputStr = JOptionPane.showInputDialog("Hello! Welcome to ShowMeTheMoney!\nEnter an amount of change in ¢: ");
		int centInput = Integer.parseInt(centInputStr);
		//mathematicals
		int leftover = centInput;
		int hundys = leftover / 10000;
		leftover = leftover-(hundys*10000);
		int tens = leftover / 1000;
		leftover = leftover-(tens*1000);
		int ones = leftover / 100;
		leftover = leftover-(ones*100);
		int quarters = leftover / 25;
		leftover = leftover-(quarters*25);
		int dimes = leftover / 10;
		leftover = leftover-(dimes*10);
		int nickels = leftover / 5;
		leftover = leftover-(nickels*5);
		int pennies = leftover;
		
		//closes scanner
		//input.close();
		//new old output
		/*
		if(hundys != 1) {
			System.out.printf("%s\tHundies \n", hundys);
		} else {
			System.out.printf("%s\tHundy \n", hundys);
		}
		if(tens != 1) {
			System.out.printf("%s\tTens \n", tens);
		} else {
			System.out.printf("%s\tTen \n", tens);
		}
		if(ones != 1) {
			System.out.printf("%s\tOnes \n", ones);
		} else {
			System.out.printf("%s\tOne \n", ones);
		}
		if(quarters != 1) {
			System.out.printf("%s\tQuarters \n", quarters);
		} else {
			System.out.printf("%s\tQuarter \n", quarters);
		}
		if(dimes != 1) {
			System.out.printf("%s\tDimes \n", dimes);
		} else {
			System.out.printf("%s\tDime \n", dimes);
		}
		if(nickels != 1) {
			System.out.printf("%s\tNickels \n", nickels);
		} else {
			System.out.printf("%s\tNickel \n", nickels);
		}
		if(pennies != 1) {
			System.out.printf("%s\tPennies \n", pennies);
		} else {
			System.out.printf("%s\tPenny \n", pennies);
		}		
		*/
		//new output window
		if(hundys != 1) {
			String hundys = ("%s\tHundies \n"+ hundys);
		} else {
			String hundys = ("%s\tHundy \n", hundys);
		}
		if(tens != 1) {
			String tens = ("%s\tTens \n", tens);
		} else {
			String tens = ("%s\tTen \n", tens);
		}
		if(ones != 1) {
			String ones = ("%s\tOnes \n", ones);
		} else {
			String ones = ("%s\tOne \n", ones);
		}
		if(quarters != 1) {
			JOptionPane.showMessageDialog("%s\tQuarters \n", quarters);
		} else {
			JOptionPane.showMessageDialog("%s\tQuarter \n", quarters);
		}
		if(dimes != 1) {
			JOptionPane.showMessageDialog("%s\tDimes \n", dimes);
		} else {
			JOptionPane.showMessageDialog("%s\tDime \n", dimes);
		}
		if(nickels != 1) {
			JOptionPane.showMessageDialog("%s\tNickels \n", nickels);
		} else {
			JOptionPane.showMessageDialog("%s\tNickel \n", nickels);
		}
		if(pennies != 1) {
			JOptionPane.showMessageDialog("%s\tPennies \n", pennies);
		} else {
			JOptionPane.showMessageDialog("%s\tPenny \n", pennies);
		}		
		
	}
}
