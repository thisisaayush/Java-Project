package Vehicles;

public class MainVehicles {
    public static void main(String[] args) {
        Car car = new Car( "Car","D3K",4,4,5 );
        Outlander outlander = new Outlander( 33 );
        outlander.velocity( 36 );/*move() method here is called automatically from Outlander class from if condition
        of an Outlander class- line 43- where if new velocity is greater than 35 invoke move() method of a Vehicle class.*/
        outlander.velocity( 33 );/*Here, the total velocity will be sum of previous velocity- 36 and
         current velocity-33, which is 36 + 33 = 69 and also it will check if condition of an Outlander class
        -line 43- where new velocity is greater than 35 calls move() method of a Vehicle class.*/
    }
}
