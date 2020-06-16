//Demonstrate the use of composition.
package PC;
public class MainPC {
    public static void main(String[] args) {
        //Initialization.
        Dimensions dimensions = new Dimensions( 24, 22, 4 );
        Resolution resolution = new Resolution( 2440, 1440 );

        Monitor theMonitor = new Monitor( "E2318H", 23, resolution, "Dell" );
        Case theCase = new Case( "E2026HS", "HP", "Automatic", dimensions );
        Motherboard theMotherboard = new Motherboard( "Thunder-Bolt", "Apple", 4, 5, "v2.44" );

        PC thePC = new PC( theCase, theMotherboard, theMonitor );

        //now we are going to invoke the properties of different classes and methods.
        thePC.pcMethod();
        theMonitor.monitorMethod();
        theCase.caseMethod();
        theMotherboard.motherboardMethod();

        System.out.println("The height of the model is "+
        theCase.getDimension().getHeight());

        System.out.println("Manufacturer of the PC case is "+thePC.getTheCase().getManufacture() +".");

        System.out.println("Manufaturere of the PC motherboard is "+ thePC.getThemotherboard().getManufacturer()+".\nThe model" +
                " name is "+thePC.getThemotherboard().getModel()+".");

        System.out.println();

        //Note: thePC.getThemotherboard().getModel() invokes the same model as theMotherboard.getModel().

    }
}
