import java.util.Scanner;

public class Time1 {

	public static void main(String[] args) {
		int hours, min, sec, sum;
		String strHours, strMin, strSec;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter hours: ");
		
		
		hours = input.nextInt();
		if (hours == 1) {
			strHours = " hour, ";
		} else {
			strHours = " hours, ";
		}
		
		
		System.out.println("Enter minutes: ");
		min = input.nextInt();
		if (min == 1) {
			strMin = " minute, ";
		} else {
			strMin = " minutes, ";
		}
		
		
		System.out.println("Enter seconds: ");
		sec = input.nextInt();
		if (sec == 1) {
			strSec = " second";
		} else {
			strSec = " seconds";
		}
		
		sum = (hours * 60 *60) + (min *60 *60) + sec;
		
		System.out.println("" + hours + strHours + min + strMin + "and " + sec + strSec + " is equal to " + sum + " seconds.");
		input.close();

	}

}
