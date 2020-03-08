
public class IsoscelesRightTriangle extends Triangle{

    private int base, height;

	public IsoscelesRightTriangle(int b, int h) {
		super(b, h);
		base = b;
		height = h;
		// note: leg is not same as height
	}

	public IsoscelesRightTriangle() {
		super(6,4);
		base = 6;
		height = 4;
	}

	public double getLeg() {
		return Math.sqrt((((base)/2)*(base)/2)+(height*height));
	}

	public double getBaseAngle() {
		return Math.toDegrees(Math.atan(2*height/base));
	}
}
