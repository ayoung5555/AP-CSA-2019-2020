public class Motorcycle extends Vehicle {

    private int wheels, mpg;

    public Motorcycle(int thempg) {
        super(2, thempg);
    }

    public Motorcycle(int thewheels, int thempg) {
        super(thewheels, thempg);
    }
    
}