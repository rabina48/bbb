package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class GenericsDemo {
    public static void main (String[] args){
        ArrayList <String> obj = new  ArrayList<String>();
        obj.add("Rabina");
        obj.add("Shrestha");
        obj.add("Bhaktapur");
       // obj.add(48); Compile Errror because of type safety

        String s = obj.get(2);


        // Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. .
        Iterator<String> st = obj.iterator();
        // hasNext() method Returns true if this scanner has another token in its input.
        while (st.hasNext()){
            System.out.println(st.next());

        }


    }
}
