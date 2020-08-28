package Array;

public class ArrayDemo {
    public  static  void  main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 56};
        String array[] = {"rabina", "Sabina", "Rab", " Sab", "Kab"};
        System.out.println(arr[2]);
        System.out.println(array[4]);


        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        int x = myNumbers[1][1];
        System.out.println (x);
        System.out.println ("------------------------------------------------------");
        print();

        ArrayDemo arrayDemo = new ArrayDemo();
        arrayDemo.dis();
        arrayDemo.show();



    }
    static  void print(){
        int[] arr1 = new int[5];
        arr1 = new int[]{1, 1, 1, 1,1,1};
        for (int i = 0; i < 5; ++i) {
            System.out.println(arr1[i]);
        }

   }

   void  dis(){
       String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
       for (int a = 0; a < cars.length; a++) {
           System.out.println(cars[a]);
       }
   }

   void show(){
       String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
       for (String i : cars) {
           System.out.println(i);
       }

   }
}
