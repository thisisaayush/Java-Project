package Vehicles;

public class Car extends Vehicle// Car class here extends the Vehicle class and inherits all the features of Vehicle class.
// Car class here has general features of a car.
// Like wheels, doors, gear of a car.
{
    //private key here used for fields wheels, doors, and so on prevents their access from outside the Car class.
    private int wheels;
    private int doors;
    private int gear;
    private int currentGear;
    //Constructor of Car class. It has name, size, wheels, doors, gear parameters.
    public Car(String name, String size, int wheels, int doors, int gear) {
        super( name, size );
        this.wheels = wheels;
        this.doors = doors;
        this.gear = gear;
    }
    //changeGear method with int gear parameter.
    //It prints out the car current gear.
    public void changeGear(int gear){
        this.currentGear = gear;
        System.out.println("Car currentGear() method is called.");
        System.out.println("Car gear is shifted to "+this.currentGear+".");
        System.out.println();
    }
}
