import java.util.Scanner;

public class quadratic {

	public static void main(String[] args) {
		double x1, y1, x2, y2, mathy;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter x1: ");
		x1 = input.nextDouble();
		System.out.println("Enter y1: ");
		y1 = input.nextDouble();
		System.out.println("Enter x2: ");
		x2 = input.nextDouble();
		System.out.println("Enter y2: ");
		y2 = input.nextDouble();
		mathy = Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1) * (y2-y1)));
		System.out.println("The distance between your points is : " + mathy);
		input.close();
	}

}
