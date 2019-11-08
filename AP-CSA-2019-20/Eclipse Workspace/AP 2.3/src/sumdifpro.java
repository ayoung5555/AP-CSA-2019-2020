//Andrew Young
//2.3
//9/16/19


import java.util.Scanner;

public class sumdifpro {

	public static void main(String[] args) {
		double num1, num2, sum, diff, mult;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		num1 = input.nextDouble();
		System.out.println("Enter another number");
		num2 = input.nextDouble();
		//sum
		sum = num1 + num2;
		//diff
		diff = num1 - num2;
		//product
		mult = num1 * num2;
		//output
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + diff);
		System.out.println("Product: " + mult);
		input.close();
	}

}
