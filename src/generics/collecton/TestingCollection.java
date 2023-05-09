package generics.collecton;

import java.util.*;

public class TestingCollection {

    public static void main(String[] args) {
        List<String> collection = new ArrayList<>();
        collection.add("Noah");
        collection.add("Sarah");
        collection.add("Oyin");
        collection.add("Tobi");
        collection.add("Vivian");
        collection.add("Raji");
        collection.add("Emperor");
        collection.add("Pelurina");
        collection.add("Ridoh");
        collection.add("Moses");

        System.out.println(collection.size());
        collection.set(3, "Carpenter");
        System.out.println(collection.get(3));
        collection.add(0, "Musa");
        System.out.println(collection.get(0));
        System.out.println(collection.get(1));
        System.out.println(collection);
        System.out.printf("%n%n");

        for (String str: collection) {
            System.out.println(str);
        }

//        Iterator<String> collectionIterator = collection.iterator();
//        while (collectionIterator.hasNext()) {
//            System.out.println(collectionIterator.next());
//        }

//        collection.forEach(item -> System.out.println(item));
//        collection.forEach(System.out::println);

//        Enumeration<String> enumeration = Collections.enumeration(collection);
//        while (enumeration.hasMoreElements()) {
//            System.out.println(enumeration.nextElement());
//        }

    }
}
