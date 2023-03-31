package controlStructuresAndLoops;

import java.util.Arrays;

public class Strings {

    public static void main(String[] args) {

        String name = "    iacademy   ";
        String name2 = new String("iacademy");
        System.out.println(name == name2);
        System.out.println(name.equals(name2));

        System.out.println(name.trim());
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name2.length());
        System.out.println(name.charAt(4));
        System.out.println(name2.toUpperCase());
        System.out.println(name2.substring(1, 4));
        System.out.println(name2.indexOf('a'));
        System.out.println(name2.lastIndexOf('a'));

        /***
         * Implement an algorithm to determine if a string has all unique characters.
         * What if you cannot use additional data structures?
         * Hints: #44, #177, #132
         */


    }
}
