package Lab8;

public class Triangle extends GraphicObject {

    private double high;
    private double width;

    public Triangle() {
    }

    public Triangle(double high, double width) {
        this.high = high;
        this.width = width;
    }

    @Override
    void findArea() {
       super.area = this.width * this.high * 0.5;
        System.out.println("The are of Triangle :"+super.area);
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
