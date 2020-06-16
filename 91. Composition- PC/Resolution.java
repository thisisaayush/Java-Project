package PC;

public class Resolution {
    private int width;
    private int height;

    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void resolution(){
        System.out.println("Resolution is the number of pixels (individual points of color) " +
                "contained on a display monitor, expressed in terms of the number of pixels on the" +
                 " horizontal axis and the number on the vertical axis");
    }
}
