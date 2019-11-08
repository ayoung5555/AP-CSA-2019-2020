// Andrew Young
// Assignment 2.5
import java.util.Scanner;

public class YellowPages {

	public static void main(String[] args) {
		System.out.println("Hello! This is a Yellow Pages Converter thingy");
		System.out.println("");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter First Name: ");
		String nameFirst = input.nextLine();
		System.out.print("Enter Last Name: ");
		String nameLast = input.nextLine();
		System.out.print("Enter Street Number: ");
		String streetNumber = input.nextLine();
		System.out.print("Enter Street Name: ");
		String streetName = input.nextLine();
		System.out.print("Enter City Name: ");
		String city = input.nextLine();
		System.out.print("Enter State: ");
		String state = input.nextLine();
		System.out.print("Enter Zip Code: ");
		int zip = input.nextInt();
		System.out.println("");
		input.close();
		System.out.printf("Your Mailing Address is:\n  \n%s %s\n%s %s \n%s, %s %s", nameFirst, nameLast, streetNumber, streetName, city, state, zip);
	}

}
