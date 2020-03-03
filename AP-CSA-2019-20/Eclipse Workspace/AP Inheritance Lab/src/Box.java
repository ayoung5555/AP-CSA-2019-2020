
/**
 * box demo.
 * 
 * @author D. Carruthers 
 * @version 2/29/2016
 */
public class Box extends Rectangle
{
	// instance variables 
	private int height;

	/**
	 * Constructor for objects of class box
	 */
	public Box(int l, int w, int h)
	{
		// call superclass
		super(l, w);
	    // initialise instance variables
		height = h;
	}

	// return the height
	public int getHeight()
	{
		return height;
	}

}
