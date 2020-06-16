

package PC;
public class Monitor {
    private String model;
    private int size;
    private Resolution resolution;//Composition concept.
    private String manufacturer;

    public Monitor(String model, int size, Resolution resolution, String manufacturer) {
        this.model = model;
        this.size = size;
        this.resolution = resolution;
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("A pixel is a single point in a graphic image. Pixels are arranged in rows and columns." +
                " Rows: "+x +" Column: "+ y + " Color: "+color);
    }
    public void monitorMethod(){
        System.out.println("Monitor method is called.");
    }
}
