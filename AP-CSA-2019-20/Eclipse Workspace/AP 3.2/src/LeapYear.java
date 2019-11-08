import java.util.Scanner;

//Andrew Young
//APCSA 3.2
//10-2-19

public class LeapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year");
		int inputyear = input.nextInt();
		if (inputyear <= 1582) //year too early
		{
			System.out.println("Enter a year on or after 1582!");
		} 
		else if (inputyear % 400 == 0 || (inputyear % 4 == 0 && inputyear % 100 != 0)) //checks mod 400 first bc of short circuiting. then runs another check instead of a nested if
		{
			System.out.println(inputyear + " is a leap year");
		} else
		{
			System.out.println(inputyear + " isn't a leap year.");
		}
		input.close();
	}

}
