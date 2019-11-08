
public class MathMethods {
		
	
	public double num1, num2;
		
	public MathMethods() {
		num1 = 0;
		num2 = 0;
	}
	
	public MathMethods(double dbl1, double dbl2) {
		num1 = dbl1;
		num2 = dbl2;
		
	}
	
	double addNumbers() {
		return num1+num2;
	}
	
	double subtractNumbers() {
		return num1-num2;
	}
	
	double multiplyNumbers() {
		return num1*num2;
	}
	
	double divideNumbers() {
		return num1/num2;
	}
	
	
	int modNumbers() {
		return (int) (num1%num2);
	}
	
	void purposeStatement() {
		System.out.println("This program takes in 2 numbers and returns them with a variety of operations.");
	}


	
	
}
