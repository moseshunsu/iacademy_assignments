package controlStructuresAndLoops;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithms {

    public static boolean isUnique(String str) {
        String newString = str.toLowerCase();
        if (newString.length() == 0 || newString.length() == 1) {
            return true;
        }

        for (int i = 0; i < newString.length(); i++) {
            char currentCharacter = newString.charAt(i);
            int locationOfCurrentCharacter = newString.substring(i+1).indexOf(currentCharacter);

            if(locationOfCurrentCharacter != -1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isUniqueUsingContains(String str) {
        String newString = str.toLowerCase();
        for (int i=0; i<newString.length(); i++) {
            char currentCharacter = newString.charAt(i);
            return str.substring(i+1).contains(String.valueOf(currentCharacter));
        }
        return true;
    }

    public static boolean isUniqueUsingArray(String str) {
        String newString = str.toLowerCase();
        char [] strArray = newString.toCharArray();
        Arrays.sort(strArray);
        for (int i=0; i < strArray.length - 1; i++) {
            if (strArray[i] == strArray[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPermutation1 (String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char [] str1Arr = str1.toCharArray();
        char [] str2Arr = str2.toCharArray();
        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);

        String firstArrayToString = Arrays.toString(str1Arr);
        String secondArrayToString = Arrays.toString(str2Arr);

        return firstArrayToString.equals(secondArrayToString);

    }

    public static boolean isPermutation2(String str1, String str2) {
        char[] str1ToArray = str1.toCharArray();
        char[] str2ToArray = str2.toCharArray();
        int sum1 = 0;
        int sum2 = 0;
        for (int i=0; i<str1ToArray.length; i++) {
            sum1 += str1ToArray[i];
        }
        for (int i=0; i<str2ToArray.length; i++) {
            sum2 += str2ToArray[i];
        }
        return sum1 == sum2;
    }

    public static String urlify(String str) {
        /**
         * convert string to array
         * use an arraylist to add all elements in the charArray while iterating through the array
         * if the current char is a space, add %20 to the list
         * convert the list to string
         */

        char [] urlArray = str.trim().toCharArray();
        List<String> list = new ArrayList<>();

        for (int i=0; i<urlArray.length; i++) {
            if (urlArray[i] == ' ') {
                list.add("%20");
            }
            list.add(Character.toString(urlArray[i]));
        }
        StringBuilder result = new StringBuilder();
        for (int i=0; i< list.size(); i++) {
            result.append(list.get(i));
        }
        return result.toString().replaceAll(" ", "%20");
    }

    public static void main(String[] args) {
//        System.out.println(isUnique("chidnma"));
//        System.out.println(isUniqueUsingContains("musa"));
//        System.out.println(isUnique("chidinma"));
//        System.out.println(isUniqueUsingContains("chidinma"));
//        System.out.println(isUniqueUsingArray("Chidinma"));
//        System.out.println(isUniqueUsingArray("ChIdinma"));

//        System.out.println(isPermutation1("mosss", "moses"));
//        System.out.println(isPermutation1("musa", "muas"));
//        System.out.println(isPermutation1("musa", "muss"));

        System.out.println(urlify("Mr John Smith   "));
    }
}
