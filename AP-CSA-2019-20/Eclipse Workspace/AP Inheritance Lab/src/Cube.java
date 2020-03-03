
public class Cube extends Box {
	
	private int side;
	
	public Cube(int l, int w, int h) {
		super(l, w, h);
		side = l; //sets all side lengths to be the first length
		
	}
	
	public Cube(int s) {
		super(s,s,s);
		side = s;
	}
	
	public Cube() {
		super(0,0,0); //default side length is zero
	}
	
	public int getSide() {
		return side; //since all sides are equal, only one var is needed
	}
	
	public int getVolume() {
		return side*side*side;
	}

}
