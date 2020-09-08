package Exception;

import java.util.Scanner;

public class Throw1 {
    public  static  void  main(String[] args){
        double n1, n2, cal1 =1 ;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter two num to whose multiply is must be less than 100");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        try {
            cal1 = n1 * n2;

            if(cal1 > 100){
                throw new Exception();
            }else{
                System.out.println(cal1);
            }
        }catch (Exception e){
            System.out.println("Error!");

        }

    }

    }

