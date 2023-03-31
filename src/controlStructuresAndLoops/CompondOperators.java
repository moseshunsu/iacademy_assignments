package controlStructuresAndLoops;

public class CompondOperators {

    public static void main(String[] args) {

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // and, or, not
        int age = 20;
        String nationality = "Nigerian";
        if (age >= 18 && nationality.equalsIgnoreCase("nigerian")) {
            System.out.println("You're eligible to vote");
        } else {
            System.out.println("You're not eligible to vote");
        }
    }
}
