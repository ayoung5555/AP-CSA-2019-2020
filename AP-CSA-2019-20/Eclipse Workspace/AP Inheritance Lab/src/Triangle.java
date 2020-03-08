
public class Triangle {
	
	private int base, height, side1, side2, side3;
	
	public Triangle(int b, int h) {
		base = b;
		height = h;
	}
	
	public Triangle(int s1, int s2, int s3) {
		 side1 = s1;
		 side2 = s2;
		 side3 = s3;
	}

	public Triangle(int s1) {
		side1 = s1;
		side2 = s1;
		side3 = s1;
	}

	public Triangle() {
		side1 = 4;
		side2 = 5;
		side3 = 6;
	}
	
	public int getPerimeter() {
		return side1+side2+side3;
	}

	public double getArea() {
		if (base == 0 || height == 0) {
			double p = (side1 + side2 + side3) / 2;
			return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
		} else {
			return base/height*2;
		}
		
		
	}
}
