package map.set.examples;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// convert a HashSet to a TreeSet
public class DataBaseStudent {
    public static void main(String[] args){
        HashSet <String> hashSetStudent = new HashSet<>();
        hashSetStudent.add("Rabina");
        hashSetStudent.add("Sabina");
        hashSetStudent.add("jack");
        hashSetStudent.add("June");
        hashSetStudent.add("Rab") ;

        System.out.println(hashSetStudent);


        Set<String> intoTreeSet = new TreeSet<String>(hashSetStudent);


        System.out.println("TreeSetContains = ");
        for (String convert: hashSetStudent){
            System.out.println(intoTreeSet);
        }





    }

}
