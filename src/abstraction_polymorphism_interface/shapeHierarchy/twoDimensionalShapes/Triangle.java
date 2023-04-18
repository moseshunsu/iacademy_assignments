package abstraction_polymorphism_interface.shapeHierarchy.twoDimensionalShapes;

public class Triangle extends TwoDimensionalShape{
    private double b;
    private double h;

    public Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double getArea() {
        return (getB() * getH() / 2);
    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "b=" + b +
                ", h=" + h +
                '}';
    }
}
