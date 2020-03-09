public class Car extends Vehicle {

    private int wheels, mpg;

    public Car(int thempg) {
        super(4, thempg);
    }

    public Car(int thewheels, int thempg) {
        super(thewheels, thempg);
    }
    
}