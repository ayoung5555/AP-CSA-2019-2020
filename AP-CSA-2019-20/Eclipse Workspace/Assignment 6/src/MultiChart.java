//Andrew Young
//Assignment 6
//5-3-19 | MultiChart

public class MultiChart { //the class

	public static void main(String[] args) {
		System.out.println("-------------------------------------------------------------------");
		System.out.printf("    0 |"); //hard coded 0 because of vertical line
		for(int top = 1; top<= 12; top ++) {
			System.out.format("%5d", top); //top 12 row
		}
		System.out.printf("\n"); //switches to next line
		System.out.println("-------------------------------------------------------------------");
		for(int count = 1; count <= 12; count++) { //for loop for vertical (1-12)
			System.out.format("%5s",count); //vertical number column
			System.out.format("%2s", "|"); //vertical line
			for(int count2 = 1; count2 <= 12; count2++) { //for loop for horizontal (1-12)
				System.out.format("%5d", count2 * count); //legit multiplication
			}
			System.out.printf("\n");//printf not println otherwise it skips 2 lines
		}

	}

}
