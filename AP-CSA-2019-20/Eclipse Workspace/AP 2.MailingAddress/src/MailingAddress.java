// Andrew Young
// MailingAddress
// 9/23/19

import java.util.Scanner;

public class MailingAddress {

	public static void main(String[] args) {
		Scanner inputscan = new Scanner(System.in);
		System.out.println("First Name: ");
		String fn = inputscan.nextLine();
		System.out.println("Last Name: ");
		String ln = inputscan.nextLine();
		System.out.println("Street Address:  ");
		String add = inputscan.nextLine();
		System.out.println("City: ");
		String city = inputscan.nextLine();
		System.out.println("State: ");
		String st = inputscan.nextLine();
		System.out.println("Zip Code: ");
		String zip = inputscan.nextLine();
		inputscan.close();
		System.out.println("Your Mailing Address is: \n\n" + fn + " " + ln + "\n" + add + "\n" + city + " " + st + ", " + zip);

	}

}
