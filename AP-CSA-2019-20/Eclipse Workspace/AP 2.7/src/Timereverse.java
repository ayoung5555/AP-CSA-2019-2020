import java.util.Scanner;

public class Timereverse {

	public static void main(String[] args) {
		int hours, min, sec, leftover, orig;
		String strHours, strMin, strSec;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter seconds: ");
		sec = input.nextInt();
		orig = sec;
		if (sec == 1) {
			strSec = " second";
		} else {
			strSec = " seconds";
		}
		hours = sec/3600;
		leftover = sec % 3600;
		min = leftover / 60;
		leftover = leftover % 60;
		sec = leftover;
		
		if (hours == 1) {
			strHours = " hour, ";
		} else {
			strHours = " hours, ";
		}
		if (min == 1) {
			strMin = " minute, ";
		} else {
			strMin = " minutes, ";
		}
		
		
		
		
		System.out.println(orig + strSec + " is equal to " + hours + strHours + min + strMin + sec + strSec);
		input.close();

	}

}
