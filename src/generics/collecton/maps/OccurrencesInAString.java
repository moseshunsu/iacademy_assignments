package generics.collecton.maps;

import java.util.*;

public class OccurrencesInAString {

    public static void main(String[] args) {
        System.out.println(occurrencesInAString("apple"));
        System.out.println(occurrencesInAString("moses"));
    }

    public static Map<Character, Integer> occurrencesInAString(String str) {
        String newStr = str.toLowerCase();
        char[] strArray = newStr.toCharArray();
        Map<Character, Integer> strMap = new HashMap<>();

        int sum = 1;

        for (char c : strArray) {
            for (int j = 1; j < strArray.length; j++) {
                if (c == strArray[j]) {
                    sum++;
                }
            }
            strMap.put(c, sum);
            sum = 0;
        }

        return strMap;
    }


}
