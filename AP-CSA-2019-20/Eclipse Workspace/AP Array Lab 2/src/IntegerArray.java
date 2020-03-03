import java.util.Arrays;

public class IntegerArray {
private int myArray [];
private int sum, odds;
private int evenArray[], tempArray[];

//Constructor - Sets myArray to the variable in the parameter.  Sets all other variables to initial value

public IntegerArray(int [] x){
	myArray = x;
	evenArray = new int[10];
}

//Returns the original array in ascending order
public int[] sortArray(){
	tempArray = myArray.clone();
	Arrays.sort(tempArray);
	return tempArray;
}

//Returns the sum of all elements in the array.
public int sumElements(){
	sum = 0;
	for (int i = 0; i < myArray.length; i++) {
		sum += myArray[i];
	}
	return sum;
}

//Returns an array will all the even numbers in the array
public int[] evenNumbers(){
	int nums = 0;
	for (int i = 0; i < myArray.length; i++) {
		if (myArray[i] % 2 == 0) {
			evenArray[nums] = myArray[i];
			nums++;
		}
	}
	return evenArray;
}

//Returns the number of odd numbers in the array.
public int numberOfOdds(){
	odds = 0;
	for (int i = 0; i < myArray.length; i++) {
		if (myArray[i] % 2 != 0) {
			odds++;
		}
	}
	return odds;
}
}
