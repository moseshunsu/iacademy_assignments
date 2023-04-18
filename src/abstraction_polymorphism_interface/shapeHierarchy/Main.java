package abstraction_polymorphism_interface.shapeHierarchy;

import abstraction_polymorphism_interface.shapeHierarchy.threeDimensionalShapes.Cube;
import abstraction_polymorphism_interface.shapeHierarchy.threeDimensionalShapes.Sphere;
import abstraction_polymorphism_interface.shapeHierarchy.threeDimensionalShapes.Tetrahedron;
import abstraction_polymorphism_interface.shapeHierarchy.twoDimensionalShapes.Circle;
import abstraction_polymorphism_interface.shapeHierarchy.twoDimensionalShapes.Square;
import abstraction_polymorphism_interface.shapeHierarchy.twoDimensionalShapes.Triangle;
import abstraction_polymorphism_interface.shapeHierarchy.twoDimensionalShapes.TwoDimensionalShape;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Cube cube = new Cube(5);
        Sphere sphere = new Sphere(6);
        Square square = new Square(7);
        Tetrahedron tetrahedron = new Tetrahedron(8);
        Triangle triangle = new Triangle(9, 12);

        Shape [] shapes = {circle, cube, sphere, square, tetrahedron, triangle};

        for (Shape shape: shapes) {
            if (shape instanceof TwoDimensionalShape) {
                System.out.println("This is a TwoDimensionalShape" + '\n' + shape + '\n');
            } else {
                System.out.println("This is a ThreeDimensionalShape" + '\n' + shape + '\n');
            }
        }
    }
}
