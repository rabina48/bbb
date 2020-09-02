package map.set.examples;

import java.util.HashMap;
import java.util.Map;


public class StudentInfo {
    public static void main (String[] args){
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Rabina",50102);
        hashMap.put("Sabina",25364);
        hashMap.put("karuna",478596);
        hashMap.put("Rab",789466);

        System.out.println("Size is = "+hashMap.size());
        System.out.println(hashMap);
        System.out.println("---------------------------------------------------------");

        for (Map.Entry<String, Integer> e: hashMap.entrySet())
            System.out.println(e.getKey()+" = " +e.getValue());

        System.out.println("---------------------------------------------------------");

        if(hashMap.containsKey("Rabina")){
            Integer regNo = hashMap.get("Rabina");
            System.out.println("value of Register no for 'Rabina' = "+regNo);
        }



    }



}
