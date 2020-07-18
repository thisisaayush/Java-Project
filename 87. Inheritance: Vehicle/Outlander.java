package Vehicles;

public class Outlander extends Car// Outlander class  extends Car class and inherits all the features of Car class.
{
    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super( "Outlander", "F3D", 4, 4, 6 );//Denotes the fields of Parent class.
        this.roadServiceMonths = roadServiceMonths;
    }

    public void velocity(int rate){
        double newVelocity = getCurrentVelocities() + rate;//Sum up the previous input velocity and the current velocity
        //and returns total velocity and jumps to the condition based on the total velocity.
        //Respective if else if else statement will be called based on the given velocity.
        if(newVelocity == 0){
            stop();
            System.out.println("Car gear is now will be shifted to 1.");
            changeGear( 1 );
            System.out.println("Checking is complete.");
            System.out.println();
        }
        else if(newVelocity > 0 && newVelocity <= 20){
            changeGear( 1 );
            System.out.println("Checking is complete.");
            System.out.println();
        }
        else if(newVelocity > 20 && newVelocity <= 35){
            changeGear( 2 );
            System.out.println("Checking is complete.");
            System.out.println();
        }
        else if(newVelocity > 35 && newVelocity <= 60 ){
            changeGear( 3 );
            System.out.println("Checking is complete.");
            System.out.println();
        }
        else {
            changeGear( 4 );
            System.out.println("Checking is complete.");
            System.out.println();
        }

        if(newVelocity > 35){
           move( newVelocity,getCurrentDirections() );
        }
    }
    @Override
    public void changeGear(int gear) {
        System.out.println("changeGear() method of Car class is overridden.\nOutlander current gear is "+gear+".");
    }
}
