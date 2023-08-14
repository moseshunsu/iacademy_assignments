package streamsAndLambdas;

import java.awt.*;
import java.text.CompactNumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;

public class StreamsAndLambdas {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
        System.out.println("Using declarative style");
        System.out.println(IntStream.rangeClosed(1, 10).sum());


        // sum of even number between 2 and 20
        System.out.println(IntStream.rangeClosed(2, 20).filter(x -> x % 2 == 0).sum());

//        IntStream.rangeClosed(2, 20).map(x -> )

        UnaryOperator<Integer> unary = x -> x * 10;
        System.out.println(unary.apply(100));
        System.out.println(unary.apply(5));


        System.out.println(multBy10.apply(5));
        System.out.println(multBy10.andThen(add500).apply(5));

        IntUnaryOperator intUnaryOperator = x -> x * 10;
        System.out.println(intUnaryOperator.applyAsInt(5));

//        List<Integer> listOf10 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        listOf10.forEach(integerConsumer);

        IntStream.rangeClosed(1, 10).forEach(System.out::println);

        System.out.println("-------------------------------------");
        List<String> listOfLearners = List.of("Noah", "Tobi", "Oyin", "Sarah", "Pelumi", "Chidinma", "Kehinde",
                "Adeolu", "Ridoh", "Moses");
//        listOfLearners.forEach(x -> System.out.println(x));
        listOfLearners.forEach(System.out::println);

        Consumer<List<Integer>> displayList = list -> list.forEach(System.out::println);
        List<Integer> list = List.of(1, 2, 3);
        displayList.accept(list);

    }
    static Function<Integer, Integer> multBy10 = x -> x * 10;
    static Function<Integer, Integer> add500 = x -> x + 500;

    static Consumer<Integer> integerConsumer = System.out::println;

    static void displayElements (List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }
    }
}
