package PC;

public class PC {
    //composition's features are used in PC class.
    private Case theCase;
    private Motherboard themotherboard;
    private Monitor themonitor;

    //Constructor
    public PC(Case theCase, Motherboard themotherboard, Monitor themonitor) {
        this.theCase = theCase;
        this.themotherboard = themotherboard;
        this.themonitor = themonitor;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Motherboard getThemotherboard() {
        return themotherboard;
    }

    public Monitor getThemonitor() {
        return themonitor;
    }

    public void pcMethod(){
        System.out.println("pcMethod() is called.");
    }
}
