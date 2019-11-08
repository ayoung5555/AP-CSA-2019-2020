


package quadratic;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("The QuadraticIshFormula Formula is (A^2+B*2+C)/2");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 'a' value: ");
		double a = input.nextDouble();
		System.out.print("Enter 'b' value: ");
		double b = input.nextDouble();
		System.out.print("Enter 'c' value: ");
		double c = input.nextDouble();
		double final1;
		final1 = (double)((a * a) + (b * 2) + c)/2;
		System.out.println(final1);
	}

}
