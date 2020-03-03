import java.util.Scanner;

public class NumRangeCounter {
	public static void main(String[] args)
	{
		boolean continueq = true;
		int rangeCounter[] = {-1, -1, -1, -1, -1, -1, -1, -1};
		System.out.println("Enter numbers from 1 to 80. Enter a number outside the range to stop.");
		while (continueq == true)
		{	
			//looop
			Scanner input = new Scanner (System.in);
			int currentNum = input.nextInt();
			if (!(currentNum >= 1 && currentNum <= 80)) 
			{
			continueq = false;
			input.close();
			} 
			else 
			{
				rangeCounter[(Integer.parseInt(Integer.toString(currentNum))-1)/10] ++;;
			}
		}
		// print end stuff here
		System.out.println("\nHere are your numbers:\n");
		
		int firstNum = 1;
		int secondNum = 10;

		for (int i = 0; i <= 7; i++){
			{
				System.out.print(firstNum + " - " + secondNum + ":\t");
				for (int j = 0; j <= rangeCounter[i];j++) 
				{
					System.out.print("*");
				}
				System.out.print("\n");
				firstNum += 10;
				secondNum += 10;
			}
		}
	}
}
