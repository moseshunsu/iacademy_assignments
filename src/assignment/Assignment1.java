package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Assignment1 {

    public static void characterAppearanceMethod1(String str) {
        String newStr = str.toLowerCase();
        char[] strArray = newStr.toCharArray();
        Arrays.sort(strArray);
        List<String> strList = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();
        int sum;

        for (int i = 0; i < strArray.length; i++) {
            boolean b = !(strList.contains(String.valueOf(strArray[i])));
            if (b) {
                sum = 1;
                strList.add(String.valueOf(strArray[i]));
                intList.add(sum);
            } else if (strList.contains(String.valueOf(strArray[i]))) {
                intList.set(strList.size() - 1, intList.get(intList.size() - 1) + 1);
            }
        }

        System.out.println("\nBreakdown is as follows:");
        for (int i = 0; i < intList.size(); i++) {
            System.out.printf("%s: %d%n", strList.get(i), intList.get(i));
        }
    }

//    public static void characterAppearanceMethod2 (String str) {
//        String newStr = str.toLowerCase();
//        char[] strArray = newStr.toCharArray();
//        Arrays.sort(strArray);
//        List<String> strList = new ArrayList<>();
//        List<Integer> intList = new ArrayList<>();
//        int sum;
//
//        strList.add(String.valueOf(strArray[0]));
//        intList.add(1);
//
//        for (int i = 1; i < strArray.length; --i) {
//            if (strArray[i] != strArray[i - 1]) {
//                sum = 1;
//                strList.add(String.valueOf(strArray[i]));
//                intList.add(sum);
//            } else if (strArray[i] == strArray[i - 1]) {
//                intList.set(strList.size() - 1, intList.get(strList.size() - 1) + 1);
//            }
//        }
//    }

    public static void characterAppearanceMethod2(String str, char c) {
        String newStr = str.toLowerCase();
        char[] strArray = newStr.toCharArray();
        int sum = 0;
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i] == c) {
                sum++;
            }
        }
        System.out.printf("%c appeared in the string %d time(s).%n", c, sum);
    }
    public static void intSum() {
        Scanner scanner = new Scanner(System.in);
        int input;
        int sum = 0;
        for (int i = 5; i > 0; i--){
            System.out.printf("Enter digit %d:%n", i);
            input = scanner.nextInt();
            sum += input;
        }
        System.out.println("\nSum of your numbers are: " + sum);
    }

    public static void factorial(int n) {
        int result = 1;
        while (n > 0) {
            result *= n;
            --n;
        }

        System.out.println(result);
    }

    public static void guessPin() {
        Scanner scanner = new Scanner(System.in);
        int pin = 7777;
        int numberOfAttempts = 3;
        int guess;

        while (numberOfAttempts > 0) {
            System.out.printf("...guess pin, you have %d attempt(s) left:%n", numberOfAttempts);
            guess = scanner.nextInt();
            if (guess == pin) {
                System.out.println("Correct, welcome back.");
                numberOfAttempts = -1;
            }
            else if (guess != pin) {
                System.out.println("\nIncorrect, try again....");
                --numberOfAttempts;
            }
        }
        if (numberOfAttempts == 0) {
            System.out.println("...sorry, but we've locked you out.");
        }
        
    }


    public static void main (String[] args) {
//        characterAppearanceMethod1("moseshunSu");
//        characterAppearance("shasde");
//        characterAppearanceMethod1("chidinma");
//        intSum();
//        factorial(6);
//        guessPin();
        characterAppearanceMethod2("moses", 's');
    }
}
