package abstraction_polymorphism_interface.shapeHierarchy.twoDimensionalShapes;

public class Square extends TwoDimensionalShape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return getA() * getA();
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                ", Area=" + getArea() +
                '}';
    }
}
