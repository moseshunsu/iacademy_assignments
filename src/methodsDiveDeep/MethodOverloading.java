package methodsDiveDeep;

public class MethodOverloading {

    public static double area(double radius){
        return Math.PI * Math.pow(radius, 2);
    }
    public static int area(int length, int breadth){
        return length * breadth;
    }
    public static double area(double base, double height){
        return 0.5 * base * height;
    }
    public static double area(double base1, double base2 ,double height) {
        return (height / 2) * (base1 + base2);
    }

    public static void main(String[] args) {
        System.out.println(area(9));
        System.out.println(area(15,11));
        System.out.println(area(9, 13));
        System.out.println(area(7,10,8));
    }
}
