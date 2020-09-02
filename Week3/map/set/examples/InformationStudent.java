package map.set.examples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

// Set is interface
// set has -LinkedHashSet((order ma auncha) -HashSet(not order)- TreeSet
//
public class InformationStudent {
    public static void main( String[] args){
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Rabina");
        hashSet.add("Sabina");
        hashSet.add("Sabina"); // add();
        hashSet.add("Sabina");
        hashSet.add("Babita");
        hashSet.add("Rabs");

        System.out.println(hashSet);


        System.out.println("-------------------------------------------------");
        System.out.println("The value Rab in list is  = "+hashSet.contains("Rab"));//used to check whether a specific element is present in the HashSet or not
        System.out.println("-------------------------------------------------");
        hashSet.remove("Sabina");
        System.out.println("After removing Sabina ="+hashSet);
        System.out.println("-------------------------------------------------");
        System.out.println("size is = "+hashSet.size());// size
        System.out.println("-------------------------------------------------");

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Rabina");
        linkedHashSet.add("Rabina");
        linkedHashSet.add("Rabina");
        linkedHashSet.add("Sabina");
        linkedHashSet.add("Babita");
        linkedHashSet.add("Rabs");
        //containsAll() method of Java HashSet is used to check whether two sets contain the same elements or not.

        System.out.println(linkedHashSet);


        System.out.println("Iterator over ");

//        Iterator<String> iterator = new Iterator<String>() {
//            @Override
//            public boolean hasNext() {
//                return false;
//            }
//
//            @Override
//            public String next() {
//                return null;
//            }
//        };

        }



    }

