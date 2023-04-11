package classWork;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists {

    public static ArrayList<String>convertArrayToArrayList(String[] array){
        ArrayList<String>classList=new ArrayList<>();
        for (String student:array){
            classList.add(student);
        }
        ArrayList<String>alternatesClassList=new ArrayList<>(Arrays.asList(array));
//        Alternative Method to the above.
        return classList;
//         return new ArrayList<>(Arrays.asList(array));
//         return alternatesClassList;
    }

    public static void main(String[] args) {
        String[] classArray={"Tobi", "Adeolu", "Sarah", "Noah", "Chidinma", "Kehinde", "Adeolu", "Pelumi", "Ridoh",
                "moses"};
        System.out.println(convertArrayToArrayList(classArray));
    }
}
