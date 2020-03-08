

public class EquilateralTriangle extends Triangle{

	private int side;

	public EquilateralTriangle(int s) {
		super(s, s, s);
		side = s;
	}

	public EquilateralTriangle() {
		super(1,1,1);
		side = 1;
	}

	public int getSide() {
		return side;
	}

	public double getHeight() {
		return Math.sqrt(3) * 0.5 * side; //TODO CHECK
	}
}
