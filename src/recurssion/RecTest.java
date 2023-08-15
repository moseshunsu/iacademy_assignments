package recurssion;

public class RecTest {

    public static void main(String[] args) {
        System.out.println(reverseNumberIteration(435));
        System.out.println(reverseNumberIteration(1224));
    }

    public static int reverseNumberIteration(int n) {
        int reversal = 0;
        while (n > 0) {
            int remainder = n % 10;
            reversal = reversal * 10 + remainder;
            n = n / 10;
        }
        return reversal;
    }

}
