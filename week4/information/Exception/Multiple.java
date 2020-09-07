package Exception;

import java.util.Scanner;
// try catch block
public class Multiple {
    public static void main (String[] args){
        double n1, n2, cal =0 ;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter two num to divide");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        try{
            cal = n1/n2;

            if (n1==0 | n2==0){

            }
        }
        catch (ArithmeticException e) {

            System.out.println("You should not divide a number by zero");
        }

        System.out.println("The division is "+cal);


    }
}
