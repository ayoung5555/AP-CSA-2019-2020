
public class ArrayRunner {

	public static void main(String[] args) {
		
		int [] tester1 = {1, 2, 3, 4, 999}; 
		int [] tester2 = {1, 1, 5, 5, 10, 8, 7}; 
		int [] tester3 = {-10, -4, -2, -4, -2, 0}; 

		System.out.println(ArrayStuff.centeredAverage(tester1));
		System.out.println(ArrayStuff.centeredAverage(tester2));
		System.out.println(ArrayStuff.centeredAverage(tester3));
		System.out.println("");
		
		int [] tester4 = {5, 1, 5, 1, 5}; 
		int [] tester5 = {4, 1, 5, 5, 5}; 
		int [] tester6 = {5, 4, 3, 5, 4}; 
		
		System.out.println(ArrayStuff.haveFiveThree(tester4));
		System.out.println(ArrayStuff.haveFiveThree(tester5));
		System.out.println(ArrayStuff.haveFiveThree(tester6));
		System.out.println("");
		
		int [] tester7 = {1, 3, 3}; 
		int [] tester8 = {1, 7, 7}; 
		int [] tester9 = {3, 3, 2, 7, 7}; 
		
		System.out.println(ArrayStuff.either37(tester7));
		System.out.println(ArrayStuff.either37(tester8));
		System.out.println(ArrayStuff.either37(tester9));
		System.out.println("");

		int [] tester10 = {3, 1, 2, 2, 4}; 
		int [] tester11 = {1, 2, 2, 3, 99, 99, 4}; 
		int [] tester12 = {5, 9, 3, 4, 2}; 
		
		System.out.println(ArrayStuff.sum34(tester10));
		System.out.println(ArrayStuff.sum34(tester11));
		System.out.println(ArrayStuff.sum34(tester12));
		System.out.println("");
	}

}
