public class UseVehicle
{
	public static void main (String[] args)
	{
       
        
        Car camero = new Car(22);
        System.out.println("Camero: " + camero.toString());
        Car camerowithflattire = new Car(3,14);
        System.out.println("Camero with flat tire: " + camerowithflattire.toString());
        Motorcycle harley = new Motorcycle(44);
        System.out.println("Harley: " + harley.toString());
        Motorcycle tribike = new Motorcycle(3, 36);
        System.out.println("Tri-bike: " + tribike.toString());
    
    
    }
}