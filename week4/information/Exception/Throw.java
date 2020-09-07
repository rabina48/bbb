package Exception;

import java.util.Scanner;

public class Throw {
    int studentage, studentweight;


    static void checkEligibilty() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter student age");
        int studentage = sc.nextInt();
        System.out.println("enter student Weight");
        int studentweight = sc.nextInt();

        try {
            if (studentage <18 && studentweight <45) {
                throw new ArithmeticException("Student is not eligible for Vote");

            } else {
                System.out.println("Student Entry is Valid!!");

            }
        } catch (Exception e) {
            System.out.println("Cannot register!!");
        }
    }
        public static void main (String[] args){
            checkEligibilty();
            System.out.println("Welcome to the Registration process!!");

            System.out.println("Have a nice day..");

        }
    }


