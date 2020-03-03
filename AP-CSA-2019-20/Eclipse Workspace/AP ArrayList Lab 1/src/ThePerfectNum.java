import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;




public class ThePerfectNum {

	public static void main(String[] args) {
		ArrayList<Integer> theList = new ArrayList<Integer>();
		System.out.println("Enter the number of elements you want\nto generate for the ArrayList.");
		Scanner inputscan = new Scanner(System.in);
		int amtOfElements = inputscan.nextInt();
		Random generateRandoms = new Random();
		for (int k = 0; k < amtOfElements; k++) {
			theList.add(generateRandoms.nextInt(999) + 1);
		}
		//even num check
		int evenNums = 0;
		int oddNums = 0;
		for (int e : theList) {
			if (e % 2 == 0) {
				//even
				evenNums++;
			} else if (e % 2 == 1) {
				//odd
				oddNums++;
			}
		}
		//perfect num
		int perfectNums = 0;
		int currentNum;
		for (int f = 0; f < theList.size(); f++) {
			currentNum = theList.get(f);
			int sum = 0;
			for(int g = 1; g < currentNum; g++) {
				if(currentNum % g == 0) {
				sum += g;
				}
			}
			if(sum == currentNum) {
				perfectNums++;
			}
		}
		/*
		for (int h : theList) {
			if (h == 6 || h == 28 || h == 496) {
				perfectNums++;
			}
		}
		*/

		//output
		System.out.println(theList.toString());
		System.out.println("Even Numbers: " + evenNums + "\tOdd Numbers: " + oddNums + "\tPerfect Numbers: " + perfectNums);
		inputscan.close();
		
	}

}
