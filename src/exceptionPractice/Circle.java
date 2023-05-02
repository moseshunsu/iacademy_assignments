package exceptionPractice;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        validateRadius();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        validateRadius();
        this.radius = radius;
    }

    public double area () {
        return Math.PI * Math.pow(radius, 2);
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public void validateRadius () {
        if (this.radius <= 0 ) {
            throw new IllegalArgumentException("Radius should not be zero or less");
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());
    }
}
