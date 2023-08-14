package generics.collecton.maps;

import java.util.HashMap;
import java.util.Map;

public class TargetNumber {

    public static void main(String[] args) {
        System.out.println(targetNumber(new int[]{1, 2, 3, 4}, 3 ));
        System.out.println(targetNumber(new int[]{1, 2, 3, 4}, 7 ));
    }

    public static Map<String, Integer> targetNumber(int[] intArr, int targetNumb) {
        int intArrSize = intArr.length;
        Map<String, Integer> index = new HashMap<>();

        for (int i = 0; i < intArrSize; i++) {
            for (int k = 1; k < intArrSize; k++) {
                if (intArr[i] + intArr[k] == targetNumb) {
                    index.put("index 1", i);
                    index.put("index 2", k);
                }
            }
        }
        return index;
    }

    public static Map<String, Integer> withoutForLoopTargetNumber(int[] intArr, int targetNumb) {

        int intArrSize = intArr.length;
        Map<String, Integer> index = new HashMap<>();

        int k = 1;

        for (int i = 0; i < intArrSize; i++) {
            if (intArr[i] + intArr[k] == targetNumb) {
                index.put("index 1", i);
                index.put("index 2", k);
            }
            k++;
        }

        return null;
    }
}
