package Generics;

import java.util.ArrayList;
import java.util.List;

public class Learner {
    // type safety
        public static void main(String args[]) {
            List list = new ArrayList();
            list.add(10);
            list.add("Ram");  // Without out Generics
System.out.println(list);
            //With Generics

            List <Integer> obj = new ArrayList<Integer>();
            obj.add(10);
            obj.add(20);
            obj.add(100); obj.add(30);

            //obj.add("10"); // compile time error donot allow
            System.out.println(obj);


            //Type casting is not Required

            List list1 = new ArrayList();
            list1.add("Hello");
            String  s = (String) list1.get(0);//type casting ->manually
            System.out.println(list1);



            List <String> obj1 = new ArrayList<>();
            obj1.add("hello");
            String string = obj1.get(0);
            System.out.println(obj1);


            List <String> obj2 = new ArrayList<String>();
            obj2.add("Rabina");
           // obj2.add(10); // Compile Time Error


        }



}
