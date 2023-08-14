package generics.collecton.sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetPractice {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        list.add("Rooney");
        list.add("Okocha");
        list.add("Rooney");
        list.add("Tayo");

        set.add("Tayo");
        set.add("Pelurino");
        set.addAll(list);

        for (String s : set) {
            System.out.println(s);
        }
    }

}
