package augustAssignment;

import java.util.*;

public class algorithmsTest {

    public static String unsortedIntegerArray (int[] nums, int target ) {
        List<Integer> list = new ArrayList<>();
        String output = "";
        for (int num : nums) {
            int diff = target - num;
            if (list.contains(diff)) {
                output += String.format("Pair found (%d, %d) %n", num, diff);
            }
            list.add(num);
        }
        return !output.equals("") ? output : "Pair not found";
    }

    public static String kSmallestElement (int[] arr, int k) {
        Arrays.sort(arr);
        return String.format("%d'th smallest array element is %d", k, arr[k - 1]);
    }


    public static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String word : words) {
            int[] count = new int[26];
            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }
            StringBuilder keyBuilder = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (count[i] > 0) {
                    keyBuilder.append('a' + i).append(count[i]);
                }
            }
            String key = keyBuilder.toString();

            anagramGroups.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(anagramGroups.values());
    }

    public static void main(String[] args) {
        System.out.println(unsortedIntegerArray(new int[]{8, 7, 2, 5, 3, 1}, 10));
        System.out.println(unsortedIntegerArray(new int[] {5, 2, 6, 8, 1, 9}, 12));
        System.out.println(kSmallestElement(new int[] {7, 4, 6, 3, 9, 1}, 3));
        System.out.println(kSmallestElement(new int[] {7, 4, 6, 3, 9, 1}, 4));

        String[] words = {
                "actors", "costar",
                "altered", "related",
                "auctioned", "education",
                "aspired", "despair",
                "mastering", "streaming",
                "recurd", "secured"
        };

        List<List<String>> anagramGroups = groupAnagrams(words);

        for (List<String> group : anagramGroups) {
            System.out.println(group);
        }
    }

}
