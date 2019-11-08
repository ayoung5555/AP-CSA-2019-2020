//Andrew Young
//Assignment 11
//CalculateThis

import java.util.Scanner;

public class MathMethodsTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //scanner start
		System.out.println("Enter first number: ");
		String str1 = input.nextLine();//takes string from input
		double dbl1 = Double.parseDouble(str1); //takes double form input string
		System.out.println("Enter second number: ");
		String str2 = input.nextLine(); //takes string from input
		double dbl2 = Double.parseDouble(str2); //takes double form input string
		input.close(); //scanner close
		MathMethods taco = new MathMethods(dbl1,dbl2); //calls methods
		System.out.println(taco.addNumbers());
		System.out.println(taco.subtractNumbers());
		System.out.println(taco.multiplyNumbers());
		System.out.println(taco.divideNumbers());
		System.out.println(taco.modNumbers());
		taco.purposeStatement();
	}

}
