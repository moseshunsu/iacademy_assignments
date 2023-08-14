package streamsAndLambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerEx {
    public static void main(String[] args) {
        Consumer<List<Integer>> modifyList = list -> {
            list.replaceAll(integer -> 2 * integer);
        };

        Consumer<List<Integer>> displayList = list -> list.forEach(System.out::println);

        List<Integer> list = Arrays.asList(5, 3, 2);
//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(3);
//        list.add(5);

        try {
        modifyList.andThen(displayList).accept(list);
        } catch (Exception e) {
            System.out.println("Exception " + e);
            e.printStackTrace();
        }

        BiConsumer<List<Integer>, List<Integer>> testingEquality = (list1, list2) -> {
            if (list1.size() != list2.size()) {
                System.out.println("The two lists are not equal");
            } else {
                for (int i = 0; i < list1.size(); i++) {
                    if (Objects.equals(list1.get(i), list2.get(i))) {
                        System.out.println("The two lists are not equal");
                        return;
                    }
                    System.out.println("The lists are equal");
                }
            }
        };

        BiConsumer<List<Integer>, List<Integer>> displayLists = (list1, list2) -> {
            list1.forEach(System.out::println);
            list2.forEach(System.out::println);
        };

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);

        System.out.println("----BiConsumer-----");
        displayLists.accept(list1, list2);


    }
}
