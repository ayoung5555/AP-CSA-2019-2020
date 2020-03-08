public class TriangleTest
{
	public static void main (String[] args)
	{
	    Triangle one = new Triangle(3, 4, 5);
	    IsoscelesRightTriangle two = new IsoscelesRightTriangle(6, 4);
	    EquilateralTriangle three = new EquilateralTriangle(6);
       
        System.out.println("For Triangle:" );
	    System.out.println("The perimeter is  " + one.getPerimeter() );
	    System.out.println("The area is " + one.getArea()); 
	    System.out.println("For Isosceles : ");
	    System.out.println("The leg length is  " + two.getLeg() );
	    System.out.println("The base angle is " + two.getBaseAngle() + " degrees"); 
        System.out.println("For Equilateral : ");
	    System.out.println("The side length is  " + three.getSide());
	    System.out.println("The height is " + three.getHeight()); 
	    
	}
}