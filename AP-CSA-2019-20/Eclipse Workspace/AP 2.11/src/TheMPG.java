import java.util.Scanner;

public class TheMPG {

	public static void main(String[] args) {
		double gal, startMi, endMi, totalMi, mpg;
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many gallons have been used?: ");
		gal = input.nextDouble();
		System.out.println("What was the starting mileage?: ");
		startMi = input.nextDouble();
		System.out.println("What is the milage at the end of the journey?: ");
		endMi = input.nextDouble();
		totalMi = endMi - startMi;
		mpg = totalMi / gal;
		System.out.println("MPG: " + mpg);
		input.close();
		
	}

}
