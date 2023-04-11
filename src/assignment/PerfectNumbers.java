package assignment;

public class PerfectNumbers {

    public static void isPerfect(int x) {
        int sum = 0;
        StringBuilder factors = new StringBuilder();
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                sum += i;
                factors.append(i).append(", ");
            }
        }

        if (sum == x) {
            System.out.printf("%d is a perfect number, and its factors are %s%n", x, factors);
        }
//        else System.out.printf("%d is not perfect number.%n", x);
    }

    public static void isPerfectFrom1To1000() {
        for (int i = 1; i <= 1000; i++) {
            isPerfect(i);
        }
    }

    public static void main (String[] args) {
        isPerfectFrom1To1000();
        isPerfect(33550336);
        isPerfect(8128);
        isPerfect(500);
        isPerfect(496);
    }
}
