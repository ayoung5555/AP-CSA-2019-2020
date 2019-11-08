//Andrew Young
//Are We there Yet?
//Auto.java

public class Auto {
	public double mpg, gallons;	//creates public vars
	public Auto(double theMpg) { //constructor
		gallons = 0.0;
		mpg = theMpg;
	}	
	public void fillUp(double theGallons) {
		gallons += theGallons; //adds gallons
	}
	public void takeTrip(double theMiles) {
		gallons -= theMiles / mpg ; //subtracts miles/mpg
	}	
	public double reportFuel() {
		return gallons; //returns gallons left as double
	}
}