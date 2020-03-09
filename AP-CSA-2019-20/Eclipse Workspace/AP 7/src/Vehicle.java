public class Vehicle {

    private int wheels;
	private int mpg;

    public Vehicle(int numofwheels, int numofmpg) {
        wheels = numofwheels;
        mpg = numofmpg;

    }

    public String toString() {
        return "\nWheels: " + wheels + "\tMPG: " + mpg;
    }

    public int getWheels() {
        return wheels;
    }

    public int getMPG() {
        return mpg;
    }
    
}