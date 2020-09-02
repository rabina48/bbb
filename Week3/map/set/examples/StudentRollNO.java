package map.set.examples;

import java.util.*;
// SET - HashSet, LinkedHashSet, TreeSet

// HashSet
// to store elements distinctly without duplication, or unique elements.
public class StudentRollNO {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();// Can be Random
        hashSet.add("Rabina");
        hashSet.add("Sabina");
        hashSet.add("Kabita");
        hashSet.add("Raja");
        hashSet.add("Ram");
        hashSet.add("Rabina");
        System.out.println(hashSet);
     hashSet.remove("Sabina");
        System.out.println("After Removing 'sabina'="+hashSet);
        System.out.println("------------------------------------------------------");

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();// It has track the index
        linkedHashSet.add("Rabina");
        linkedHashSet.add("Sabina");
        linkedHashSet.add("Kabita");
        linkedHashSet.add("Raja");
        linkedHashSet.add("Ram");
        linkedHashSet.add("Rabina");
        System.out.println(linkedHashSet);

        TreeSet<String> treeSet = new TreeSet<>();// It has track the Order maintain.
        treeSet.add("Rabina");
        treeSet.add("Sabina");
        treeSet.add("Kabita");
        treeSet.add("Raja");
        treeSet.add("Ram");
        treeSet.add("Rabina");
        System.out.println(treeSet);
        System.out.println("------------------------------------------------------");
        System.out.println("The treeSet contain 'Rabina' is = "+treeSet.contains("Rabina"));
        System.out.println("The First value in TreeSet is =  "+treeSet.first());
        System.out.println("The Last value in TreeSet is = "+treeSet.last());
        System.out.println("          ");
display();
        System.out.println("******************************************");
        System.out.println("HashSet  = "+hashSet);
        System.out.println("LinkedHashSet  = "+linkedHashSet);
        System.out.println("TreeSet  = "+treeSet);




    }

   static void display(){
        System.out.println("Comparing between HashSet, LinkedHashSet, TreeSet are: ");

    }

}
