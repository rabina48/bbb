package Exception;

import java.util.Scanner;

public class MultipleException {

    public static void main(String[] args) {
        double a = 10, b = 0, cal = 0;

        String add = null;
        double arr[] = new double[5];

        try {
            cal = a / b;

            for (int i = 0; i <= 3; i++) {
                arr[i] = i + 1;
            }
            for (double value : arr) {

            }

            if (add.equals("Add")) {
                System.out.println("Match");
            } else {
                System.out.println("Unmatch");
            }

        } catch (ArithmeticException e) {
            System.out.println("Cant divide by Zero, Please Edit your input");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Size got Out of Bounds");

        } catch (NullPointerException e) {
            System.out.print("Caught NullPointerException");
            System.out.print("-----------------------------------");

        }
        System.out.print(cal);
    }



    }





