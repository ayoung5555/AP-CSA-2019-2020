//Andrew Young
//2.5
//9/16/19



import java.util.Scanner;

public class converter1 {

	public static void main(String[] args) {
		double num1, num2;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number of miles:");
		num1 = input.nextDouble();
		num2 = Math.floor(num1 * 1.60935 * 100000) / 100000; //rounds the var to the 100.000 place
		System.out.println(num1 + "mi is equal to " + num2 + "km");
		input.close();

	}

}
