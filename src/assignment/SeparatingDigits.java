package assignment;

public class SeparatingDigits {

    public static String quotientCalculation(int a, int b) {
        return String.valueOf(a / b);
    }

    public static String remainderCalculation(double a, double b) {
        String remainder = Double.toString(a / b);

        return remainder.substring(remainder.indexOf(".") + 1);
    }

    public static void displayDigits(int num) {
        StringBuilder results = new StringBuilder();
        String quotientHolder = String.valueOf(num);
        StringBuilder remainderHolder = new StringBuilder();

        if (num > 1 && num < 99999) {
            for (int i = 0; i < String.valueOf(num).length(); ++i) {
                remainderHolder.append(remainderCalculation(Double.parseDouble(quotientHolder), 10));
                quotientHolder = quotientCalculation(Integer.parseInt(quotientHolder), 10);
            }

            for (int i = remainderHolder.length() - 1; i >= 0; --i) {
                results.append(remainderHolder.charAt(i)).append("  ");
            }

            System.out.println(results);
        } else  {
            System.out.println("Integers should only between 1 and 99999.");

        }
    }

    public static void main(String[] args) {
//        System.out.println(quotientCalculation(78, 7));
//        System.out.println(remainderCalculation(78, 7));
//        System.out.println(remainderCalculation(10, 100));
        displayDigits(5643572);
        displayDigits(457);
    }
}
