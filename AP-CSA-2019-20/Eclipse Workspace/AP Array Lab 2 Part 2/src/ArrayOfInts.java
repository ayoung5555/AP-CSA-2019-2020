//Andrew Young

public class ArrayOfInts {
private int [] intArray;
private int eights;
private int runs;

//Sets intArray to the parameter and initializes all other variables
public ArrayOfInts(int [] x){
	
	intArray = x;
}

//Returns how many 8's are in the array.
public int findTheEights(){
	eights = 0;
	for (int i = 0; i < intArray.length; i++) {
		if (intArray[i] == 8) {
			eights++;
		}
	}
	return eights;
}

//Returns the number of runs in the array.
public int countTheRuns(){
	runs = 0;
	int temp = intArray[0];
	for (int i = 1; i < intArray.length; i++) {
		if (temp == intArray[i]) {
			//two nums in a row
			runs++;
		}
		temp = intArray[i];
	}
	return runs;
	}
}

