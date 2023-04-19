package methodsDiveDeep;

import java.util.*;

public class StringBuilderTest {

    public static void main(String[] args) {
//        String firstName = "Afogu";

////        Four ways of building a String Builder
//        StringBuilder sb = new StringBuilder();
//        StringBuilder sb1 = new StringBuilder("You're welcome to i-Academy");
//        StringBuilder sb2 = new StringBuilder(10);


//        sb1.reverse();
//        System.out.println(sb1);
//        sb1.toString().toUpperCase();
//        System.out.println(sb1);

//        System.out.println(sb1.length());
//        System.out.println(sb1.capacity());
//        sb1.setLength(50);
//        System.out.println(sb1);
//        System.out.println(sb1.length());
//        System.out.println(sb1.capacity());
//        System.out.println(sb1.charAt(2));
//        sb1.setCharAt(1, 'y');
//        System.out.println(sb1);
//
//        char [] testArray = new char[10];
//
//        sb1.getChars(4,11, testArray, 0);
//        System.out.println(Arrays.toString(testArray));

//        System.out.println(reverseString("Moses"));
//        System.out.println(reverseStringUsingStack("Moses"));

        System.out.println(isPalindromeUsingStringBuilder("ada"));
        System.out.println(isPalindromeUsingStringBuilder("moses"));
        System.out.println(isPalindromeBruteForceMethod("ada"));
        System.out.println(isPalindromeBruteForceMethod("moses"));
        System.out.println(isPalindromeUsingPointer("ada"));
        System.out.println(isPalindromeUsingPointer("moses"));
    }

    public static String reverseStringUsingArray(String str) {
        char[] strArray = str.toCharArray();
        String reversedString = "";
        for (int i = str.length() - 1; i >= 0; --i) {
            reversedString += strArray[i];
        }
        return reversedString;
    }

    public static String reverseStringBruteForceMethod(String str) {
        String reversedString = "";
        for (int i = str.length() - 1; i >= 0; --i) {
            reversedString += str.charAt(i);
        }
        return reversedString;
    }

    public static String reverseStringUsingStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static String reverseStringUsingArrayList(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); ++i) {
            list.add(str.charAt(i));
        }
        Collections.reverse(list);
        return list.toString();
    }

    public static String reverseStringUsingStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); ++i) {
            stack.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stack.size(); ++i) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static boolean isPalindromeUsingStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        String reversedString = sb.reverse().toString();
        return str.equals(reversedString);
    }

    public static boolean isPalindromeBruteForceMethod(String str) {
        String reversedString = "";
        for (int i = str.length() - 1; i >= 0; --i) {
            reversedString += str.charAt(i);
        }
        return  str.equals(reversedString);
    }

    public static boolean isPalindromeUsingPointer(String str) {
        int i = 0;
        for (int j = str.length() - 1; j >= 0; --j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isPalindromeUsingStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        Iterator<Character> iterator = stack.iterator();
        while (iterator.hasNext()){
            sb.append(stack.pop());
        }
        System.out.println(sb);
        return str.equalsIgnoreCase(sb.toString());
    }
}
