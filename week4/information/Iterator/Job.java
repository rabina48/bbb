package iterator.wrapper;
//Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
// when working with Collection objects, such as ArrayList, where primitive types cannot be used
//Eg int -> Integer, double-> Double
public class Job {
    public static void main(String[] args) {
        Integer myInt = 15;
        Double myDouble = 15.99;
        Character myChar = 'Z';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);
        System.out.println("--------------------------------");
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());
    }
}
