package Exception;

import java.util.Scanner;

public class ExceptionDemo {

        public static void main(String args[]){
            int n1, n2, cal1 =1 ;

            Scanner sc = new Scanner(System.in);
            System.out.println("enter two num to divide");
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            try{
                cal1 = n1/n2;

                System.out.println(cal1);

            }
            catch(ArithmeticException e){
                System.out.println("You should not divide a number by zero");
            }


            catch(Exception e){
                System.out.println("Some Other Exception");
            }

        }
    }

