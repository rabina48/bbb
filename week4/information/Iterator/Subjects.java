package iterator.wrapper;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.ListIterator;

// Iterator is looping through collection
//Note: Trying to remove items using a for loop or a for-each loop would not work correctly
// because the collection is changing size at the same time that the code is trying to loop.
public class Subjects {

    public  static  void  main(String[] args){
        ArrayList<String> subject = new ArrayList<String>();
        subject.add("Java");
        subject.add("Python");
        subject.add("C");
        subject.add("C++");
        subject.add("C#");
        subject.add("Ruby");
        subject.add("Rust");
        Iterator <String> iterator = subject.iterator(); // Use to loop collection like ArrayList...

        while(iterator.hasNext()){
            Iterator itr = subject.iterator();
            Object element = iterator.next();
            System.out.println(element+" ");// ?
        }
        System.out.println("************Let's Modify**************");



        ListIterator litr = subject.listIterator();
        while (litr.hasNext()){
              for (int i= 1; i<10; i ++){
                  Object element1 = litr.next();
                  System.out.println(i+")  "+element1+"  -----------  Good  It's Rank = " +i);

              }


        }
        System.out.println("===========Stay Tured!!============");


    }
}
