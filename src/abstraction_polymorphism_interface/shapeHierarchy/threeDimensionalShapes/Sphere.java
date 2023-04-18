package abstraction_polymorphism_interface.shapeHierarchy.threeDimensionalShapes;

public class Sphere extends ThreeDimensionalShape {
    private double r;

    public Sphere(double r) {
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
        return 4 * Math.PI * Math.pow(getR(), 2);
    }

    @Override
    public double getVolume() {
        return ((double) 4 / 3) * Math.PI * Math.pow(getR(), 3);
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "r=" + r +
                ", Area=" + getArea() +
                ", Volume" + getVolume() +
                '}';
    }
}
