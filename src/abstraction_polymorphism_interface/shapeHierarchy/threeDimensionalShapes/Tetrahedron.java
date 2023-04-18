package abstraction_polymorphism_interface.shapeHierarchy.threeDimensionalShapes;

public class Tetrahedron extends ThreeDimensionalShape{
    private double a;

    public Tetrahedron(double a) {
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
        return Math.sqrt(3) * Math.pow(getA(), 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(getA(), 3) / (6 * Math.sqrt(2));
    }

    @Override
    public String toString() {
        return "Tetrahedron{" +
                "a=" + a +
                ", Area=" + getArea() +
                ", Volume" + getVolume() +
                '}';
    }
}
