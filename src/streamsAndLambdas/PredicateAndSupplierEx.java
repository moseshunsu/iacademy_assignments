package streamsAndLambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateAndSupplierEx {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(18, 9, 25, 7);
        System.out.println(filterList(list, 10));

        Predicate<Integer> greaterThan10 = element -> element > 10;
        System.out.println(list.stream().filter(greaterThan10).collect(Collectors.toList()));

        String [] colors = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
        System.out.println(Arrays.stream(colors).map(String::toLowerCase).collect(Collectors.toList()));

        List<String> firstResult = Arrays.stream(colors).map(String::toLowerCase).collect(Collectors.toList());
        Arrays.stream(colors).map(String::toLowerCase).forEach(System.out::println);
        System.out.println("filtering");
        Arrays.stream(colors).filter(string -> string.compareToIgnoreCase("n") < 0)
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .forEach(System.out::println);

    }

    public static List<Integer> filterList(List<Integer> list, int n) {
        List<Integer> result = new ArrayList<>();
        for (Integer integer : list) {
            if (integer > n) {
                result.add(integer);
            }
        }
        return result;
    }
}
