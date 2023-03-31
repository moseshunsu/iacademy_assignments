import java.util.Scanner;

public class Product {
    public static String test (int n) {
        String fib = "";
        fib = "0 1";
        int startNumb = 0;
        int output = 1;
        String s = String.valueOf(output);
        String lastChar = fib.substring(fib.length() - 1);

        while ( n > 0 ) {
            int lastNumb = Integer.parseInt(lastChar);
            fib = fib + " " + s;
            startNumb += 1;
            output += lastNumb;
            --n;
        }

        return fib;
    }
    public static void main (String [] args) {
        System.out.print(test(3));
    }
}
