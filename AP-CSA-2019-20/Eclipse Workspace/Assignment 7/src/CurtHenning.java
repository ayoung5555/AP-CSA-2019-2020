//Andrew Young
//Assignment 7
//5/7/19 Curthenning

public class CurtHenning {

	public static void main(String[] args) {
		int min = 1;
		int max = 10000;
		
		for(min = 1; min <= max; min++) { // min is the number of iterations
			int nextLow = 0; //each number it tests
			
			for( int d = 1; d < min ; d++) {
				if (min % d == 0) { //checks if the iterations matches the number sum
					//System.out.println(i); //DEBUG
					//System.out.println(d); //DEBUG
					//System.out.println(""); //DOES POWERS OF 2 //DEBUG
					nextLow += d;
				}
	    
	    	}
	    	if(min == nextLow) {
	    		System.out.println(nextLow); //outputs the  perfect numbers when they are perfect...
	    		
				
			}
		}	
	}
}
