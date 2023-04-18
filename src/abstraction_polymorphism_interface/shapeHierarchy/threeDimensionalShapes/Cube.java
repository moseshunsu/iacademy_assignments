package abstraction_polymorphism_interface.shapeHierarchy.threeDimensionalShapes;

public class Cube extends ThreeDimensionalShape {
    private double a;

    public Cube(double a) {
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
        return 6 * Math.pow(getA(), 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(getA(), 3);
    }

    @Override
    public String toString() {
        return "Cube{" +
                "a=" + a +
                '}';
    }
}
