package Vehicles;

public class Vehicle //Vehicle class has basic features a vehicle has.
    /*
    Like name of a vehicle, size of a vehicle, velocities, directions.
     */
{
    /*Encapsulating name, size, currentVelocities, currentDirection fields. It prevents the access of the given field outside
    the class.*/
    private String name;
    private String size;
    private double currentVelocities;
    private double currentDirections;

    //Constructor method.
    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        //Initializing currentVelocities and currentDirections to 0.
        this.currentVelocities = 0;
        this.currentDirections = 0;

    }
        //Getter method to get the name of a vehicle.
    public String getName() {
        return name;
    }
        //Getter method to get the size of a vehicle.
    public String getSize() {
        return size;
    }

    public double getCurrentVelocities() {
        return currentVelocities;
    }

    public double getCurrentDirections() {
        return currentDirections;
    }
        //steer() method here gives the direction of a vehicle when it is called.
    public void steer(double directions){
        this.currentDirections = directions;
       //System.out.println("Steer method() is called.");
        System.out.println("The current direction is "+ this.currentDirections + " degree.");
    }
        //move() method here gives the velocity and the direction of a vehicle.
    public void move(double velocities, double directions){
        this.currentVelocities = velocities;
        this.currentDirections = directions;
        System.out.println("Move() method is called.");
        System.out.println("Vehicle is moving at "+this.currentVelocities + " in direction " + this.currentDirections+".");
        System.out.println();

    }
    public void stop(){
        System.out.println("Vehicles stop() method is called.");
        this.currentVelocities = 0;
    }

}
