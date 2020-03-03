// Andrew Young
// AP 6.1
// 12-11-19
// NumCounter.java

import java.util.Scanner;

public class NumCounter {

	public static void main(String[] args)
	{
		boolean continueq = true;
		int goodNums[] = new int [61];
		System.out.println("Enter numbers from 0 to 60. Enter a number outside the range to stop.");
		while (continueq == true)
		{	
			//looop
			Scanner input = new Scanner (System.in);
			int currentNum = input.nextInt();
			if (!(currentNum >= 0 && currentNum <= 60)) 
			{
			continueq = false;
			input.close();
			} 
			else // adds 1 to the value at the index of the input
			{
				goodNums[currentNum] ++;
			}
		}
		// print end stuff here
		System.out.println("\nHere are your numbers:\n");
		
		for (int j = 0; j < goodNums.length;j++) 
		{
			if (goodNums[j] != 0)
			{
			System.out.println(j + ":\t" + goodNums[j]);
			}
		}
	}
}
