package chapter;

import java.util.ArrayList;

public class DynamicArrays {

        public static void main(String[] args) {
            Integer age=5;
            String address="Infinity House";
            Long id=1324567890L;
            Float size= 2.5f;
            Double weight=50.0;
            Boolean status=true;

            int[] grades=new int[50];
            ArrayList<String> studentList=new ArrayList<>();
            ArrayList<Double> studentWeight=new ArrayList<>();
            studentList.add("Noah");
            studentList.add("Chidinma");
            studentList.add(0,"Adeolu");
            studentList.add(1, "Chidinma");
            studentList.add("Noah");
            studentList.add("Joaquin");
            studentList.add("Noah");

        /*
        for (String student: studentList){
             System.out.println(student);
        }
         */
            System.out.println(studentList);
            System.out.println(studentList.lastIndexOf("Noah"));
            System.out.println(studentList.remove("Noah"));//Remove first occurrence
            System.out.println();
        }
}
