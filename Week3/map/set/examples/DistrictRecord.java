package map.set.examples;

import calculatorr.using.function.Input;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.lang.String;

// Creating SEt


public class DistrictRecord {


    public static void main(String[] args){
        Set< String> set = new HashSet<String>();
        set.add("Kathmandu");
        set.add("bhaktapur");
        set.add("Lalitpur");
        // set.add(Integer.parseInt(input.nextLine()));

        }

     static String display() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any district in Record ");
        String district = input.nextLine();

        if(district.equals("kathmandu") | district.equals("bhaktapur") | district.equals("lalitpur")){

            System.out.println("Already exist try another");
           display();
        }

            else{
                System.out.println("your Input has been Recorded");
            }

return district;

        }




    }
//       void show() {
//           if (district.e) {
//               System.out.println("Peter is added to the set");
//           }
//
//           if (!names.add("Tom")) {
//               System.out.println("Tom is already added to the set");
//           }

