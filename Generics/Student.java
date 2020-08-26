package Generics;
//Multiple Parameter
public class Student <Name, Roll>{
    Name name;
    Roll roll;    // parameter and obj

    Student( Name name, Roll roll){ // constructor

        this.name = name;
        this.roll = roll;
    }

    public  void  display(){ // function to display
        for (int i =1; i<=3; i++){

            System.out.println(i+ ")Name of Student is "+name+" Whose Roll is " +roll);
        }

    }
    public static  void  main (String[] args){

        Student <String, Integer> obj = new Student<>("Rabina",48);
        Student <String, Integer> obj1 = new Student<>("sabina",8);
        Student <String, Integer> obj2 = new Student<>("Abina",480);

        obj.display();
        obj1.display();
        obj2.display();

    }

}
