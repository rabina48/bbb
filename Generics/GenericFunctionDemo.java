package Generics;

public class GenericFunctionDemo {
// T = Type
     <T> void genericDisplay( T element){
         System.out.println(element.getClass().getName()+ " = " +element);
    }

    public static void main (String[] args){
         GenericFunctionDemo genericFunctionDemo = new GenericFunctionDemo();
         genericFunctionDemo.genericDisplay(10);
         genericFunctionDemo.genericDisplay("Rabina");
         genericFunctionDemo.genericDisplay(1.25);
         genericFunctionDemo.genericDisplay(2525252525L);
         genericFunctionDemo.genericDisplay(2525.2525f);

    }
}

