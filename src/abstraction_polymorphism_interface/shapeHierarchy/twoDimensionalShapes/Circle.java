package abstraction_polymorphism_interface.shapeHierarchy.twoDimensionalShapes;

public class Circle extends TwoDimensionalShape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * getR() * getR();
    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
