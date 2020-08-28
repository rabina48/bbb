package Array;
import java.util.ArrayList;
// remove
public class Info {


        public static void main(String args[])
        {
            ArrayList<String> al = new ArrayList<>();

            al.add("Rabina");
            al.add("Sabina");
            al.add(1, "For");

            System.out.println(
                    "Initial ArrayList " + al);

      al.remove(1);

            System.out.println(
                    "After the Index Removal " + al);

            al.remove("Rabina");

            System.out.println(
                    "After the Object Removal " + al);
        }
    }


