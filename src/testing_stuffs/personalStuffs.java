package testing_stuffs;

public class personalStuffs {

    public static String test1(int n) {
        String fib = "";

        int firstNumber = 0, secondNumber = 1, fibonacci = 0;

        for (int c = 0; c < n; c++) {
            if (c <= 1) {
                fibonacci = c;
                fib += String.valueOf(fibonacci) + " ";
            } else {
                fibonacci = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = fibonacci;
                fib += String.valueOf(fibonacci) + " ";
            }
            System.out.println(fibonacci + " ");
        }
        System.out.println(fib);
        return fib;
    }

    public static void test2 (int rows) {
        String str = "#";
        for(int i = 1; i <= rows; i++) {
            String repeated = str.repeat(i);
//            System.out.printf("%s\n", repeated);
            System.out.print(repeated + " \n");
        }
    }

    public static void main(String[] args) {
//        test1(10);
        test2(5);
    }
}
