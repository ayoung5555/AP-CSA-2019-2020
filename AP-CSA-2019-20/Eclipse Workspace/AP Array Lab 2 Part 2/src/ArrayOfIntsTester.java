
public class ArrayOfIntsTester {
public static void main(String [] args){
	int [] testArray = new int [50];
	for(int i = 0; i < testArray.length; i++){
		int x = (int)(Math.random()*9);
		testArray[i]= x;
		System.out.print(x + ", ");
	}
	System.out.println();
	ArrayOfInts test = new ArrayOfInts(testArray);
	System.out.println(test.findTheEights());//See your array for expected
	System.out.println(test.countTheRuns());//See your array for expected
	
}
}
