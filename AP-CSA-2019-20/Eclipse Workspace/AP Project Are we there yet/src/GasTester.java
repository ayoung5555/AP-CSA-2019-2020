public class GasTester {
	
	public static void main(String args[]) {
		
		// Create a new object called myWhip. Pass the constructor an
		// argument of 24 miles per gallon
		Auto myWhip = new Auto(24);
		
		
		// Use the myWhip object to call the fillup method. Pass it an argument
		// of 20 gallons.
		myWhip.fillUp(20);
		
		
		// Use the myWhip object to call the takeTrip method. Pass it an
		// argument of 100 miles. Driving 100 miles of course uses fuel and we
		// would now find less fuel in the tank.
		myWhip.takeTrip(100);
		
		
		// Use the myWhip object to call the reportFuel method. It returns a
		// double value of the amount of gas left in the tank and this is
		// assigned
		// to the variable fuel_left
		double fuel_left = myWhip.reportFuel();
		
		
		// Print the fuel_left variable
		System.out.println(fuel_left); // prints gallons left,
										// 15.833333333333332
	}
}