package Exception;

import calculatorr.using.function.Input;

import java.util.Scanner;

 public class DemoThrows {



    public static void main(String[] args) {
        int cal = 0;


        DemoThrows demoThrows = new DemoThrows();
        Info info = demoThrows.display();
          int a=  info.n1;
          int b = info.n2;

       try {
           cal = a / b;

           
        }catch (ArithmeticException e){
            System.out.println("Error divide by zero is not possible");
        }
       finally{
           System.out.println("Thank YOu!");
       }
System.out.println("The division is = "+cal);

        }

    static Info display() throws ArithmeticException {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter two num to divide");
         int n1 = sc.nextInt();
         int n2 = sc.nextInt();
        Info in = new Info(n1, n2);

        if (n1 == 0 | n2 == 0){

        throw new ArithmeticException();
    }

        return in;
}}
