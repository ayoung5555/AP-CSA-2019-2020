import java.util.Scanner;
//Andrew Young
//10-3-19
//AP 3.4
public class SumBetween {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int in = input.nextInt();
		input.close();
		if (in<2) 
		{
			System.out.println("Enter a number equal to or greater than two.");
		}
		else
		{
			int sum = 0;
			for (int i = 0; i <= in; i+=2)
			{
				sum +=  i;
			}
			System.out.println("Sum: " + sum);
		}
	}

}
