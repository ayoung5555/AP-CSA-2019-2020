
public class Triangle {
	
	int base, height, side1, side2, side3;
	
	public Triangle(int b, int h) {
		base = b;
		height = h;
	}
	
	public Triangle(int s1, int s2, int s3) {
		 side1 = s1;
		 side2 = s2;
		 side3 = s3;
	}
	
	public int getBase() {
		int temp = side1;
		if (side2 > temp) { temp = side2; }
		if (side3 > temp) { temp = side3; }
		base = temp;
		return base; // i think this is done
		
	}
}
