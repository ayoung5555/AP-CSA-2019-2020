
public class Crayon {
	
	//instance variables
	private String color; //This is a name that relates to a preset primary color 
	private double length; //This is how long each crayon is in inches. 
	private int waxType; //The number from 1-5 matches a wax type. (EX: 1 - Bees Wax, 2 - Wool Wax, 3 - Paraffin Wax, 4 - Candle wax, 5 - Carnauba Wax) 
	
	public Crayon (String theColor, double theLength, int theWaxType)
	{
		color = theColor;
		length = theLength;
		waxType = theWaxType;
	}
	
	public Crayon (String theColor) 
	{
		color = theColor;
		length = 3.5;
		waxType = 3;
	}
	
	public Crayon () //defaults constructor
	{
		color = "red";
		length = 3.5;
		waxType = 3;
	}
	
	public void setColor (String theColor)
	{
		color = theColor;
	}
	
	public String getColor ()
	{
		return color;
	}
	
	public void setLength (double theLength)
	{
		length = theLength;
	}
	
	public double getLength ()
	{
		return length;
	}
	
	public void setWaxType (int theWaxType)
	{
		waxType = theWaxType;
	}
	
	public int getWaxType ()
	{
		return waxType;
	}
	
	public String toString () 
	{
		return ("The " + color + " crayon is " + length + " centimeters long and has wax type " + waxType);
	}
	
}
