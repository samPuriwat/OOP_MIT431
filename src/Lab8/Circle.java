package Lab8;

public class Circle extends GraphicObject {
    //attributes
    private double r;
    static double PI = 3.141;

    //constructor
    public Circle(){}

    public Circle(double r) {
        this.r = r;
    }

    @Override
    void findArea() {
        super.area = PI * (r * r);
        System.out.println("The area of Circle: "+super.area);
    }

    //getter and setter

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
