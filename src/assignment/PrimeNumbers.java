package assignment;

public class PrimeNumbers {
    public static void isPrimeNumber(int n) {
        int primeChecker = 0;

        if (n > 1) {
            for (int i = 2; i < n / 2; ++i) {
                if (n % i == 0) {
                    primeChecker = -1;
                    break;
                }
            }
        } else primeChecker = -1;

        if (primeChecker != -1) {
            System.out.println(n + " is a prime number...");
        }
    }

    public static void isPrimeNumberRewritten(int n) {
        int primeChecker = 0;

        if (n > 1) {
            for (int i = 2; i <= Math.sqrt(n); ++i) {
                if (n % i == 0) {
                    primeChecker = -1;
                    break;
                }
            }
        } else primeChecker = -1;

        if (primeChecker != -1) {
            System.out.println(n + " is a prime number...");
        }
    }

    public static void primeNumbersLessThan10000() {
        for (int i = 0; i < 10000; ++i) {
//            isPrimeNumber(i);
            isPrimeNumberRewritten(i);
        }
    }

    public static void main (String[] args) {
        isPrimeNumber(1);
        isPrimeNumber(2);
        isPrimeNumber(3);
        isPrimeNumber(4);
        isPrimeNumber(5);
        isPrimeNumber(6);
        isPrimeNumber(7);
        isPrimeNumber(8);
        isPrimeNumber(9);
        isPrimeNumber(-7);
        isPrimeNumber(-9);
//        primeNumbersLessThan10000();

    }
}
