package controlStructuresAndLoops;

import java.util.Arrays;

public class Array {

    /**
     * Creating an array
     * Access specific elements in a array
     * Change element of an array
     * Array length
     * Loop through an array
     */

    public static void main(String[] args) {

        String[] nameOfStudents = {"tobi", "oyin", "sarah", "noah", "chidinma", "moses", "deolu", "pelumi", "kenny",
                "ridoh"};
        System.out.println(nameOfStudents.length);
        System.out.println(nameOfStudents[0]);
        System.out.println(nameOfStudents[4]);
        nameOfStudents[0] = "musa";
        System.out.println(nameOfStudents[0]);
        System.out.println(Arrays.toString(nameOfStudents));

        // looping through the array
        for (int el=0; el<nameOfStudents.length; el++) {
            System.out.print(nameOfStudents[el] + " ");
        }

        
        int[] ages= new int[4];
        System.out.println(ages.length);
        ages = new int[]{1,2,4,5};

    }
}
