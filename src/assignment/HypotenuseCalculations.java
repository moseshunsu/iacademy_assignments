package assignment;


public class HypotenuseCalculations {
    
    public static double hypotenuse(double side1, double side2) {
        double hypotenuse;
        hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

        return hypotenuse;
    }

    public static void main(String[] args) {
        System.out.println(hypotenuse(5, 3));
    }
}
