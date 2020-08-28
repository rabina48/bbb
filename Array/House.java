package Array;
import java.util.ArrayList;
import java.util.List;


public class House {


    public static void main(String[] args)
    {
       List<String> list = new  ArrayList<>();

       list.add("Rabina");

        list.add("Is");
        list.add("Doing");
        list.add("Intern");
        list.add("at rasello");

        System.out.println(
                "Initial ArrayList " + list);

        list.remove(1);

        System.out.println(
                "After the Index Removal " + list);

        list.remove("Doing");

        System.out.println(
                "After the Object Removal " + list);
    }
}


