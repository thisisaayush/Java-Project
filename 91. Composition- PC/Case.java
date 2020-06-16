package PC;

public class Case {
    private String model;
    private String manufacture;
    private String powerSupply;
    private Dimensions dimension;

    public Case(String model, String manufacture, String powerSupply, Dimensions dimension) {
        this.model = model;
        this.manufacture = manufacture;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimension() {
        return dimension;
    }

    public void caseMethod(){
        System.out.println("caseMethod() is called.");
    }


}
