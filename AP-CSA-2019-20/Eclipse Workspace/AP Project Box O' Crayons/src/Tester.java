import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		//first object - default consturctor with no paramameters
		Crayon crayon1 = new Crayon();
		System.out.println(crayon1.getWaxType()); //prints default constructor value
		crayon1.setWaxType(1); //changes wax type
		System.out.println(crayon1.getWaxType()); //prints new wax type
		System.out.println(crayon1.toString()); //prints out everything
		
		//second object - default everything except color
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a color for your crayon: ");
		String color2 = input.nextLine();
		Crayon crayon2 = new Crayon(color2); //creates object with just entered string as parameter
		crayon2.setLength(4.19); //changes wax type
		System.out.println(crayon2.getLength()); //prints new wax type
		System.out.println(crayon2.toString()); //prints out everything
		
		
		//third object - has parameters for all options
		System.out.println("Enter a color for your crayon: ");
		String color3 = input.nextLine();
		System.out.println("Enter a wax type for your crayon: ");
		int waxType3 = input.nextInt();
		System.out.println("Enter a length (in cm) for your crayon: "); //here and above are inputs for parameters
		double length3 = input.nextDouble();
		Crayon crayon3 = new Crayon(color3, length3, waxType3); //creates object with all parameters available
		crayon3.setColor("Hot Pink"); //changes color that was input to Hot Pink
		System.out.println(crayon3.getColor()); //returns that the color changed
		System.out.println(crayon3.toString()); //prints out everything
		
		input.close(); //closes scanner
	}

}
