package json.implementation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

// Encoding
public class EncodingJson {
    public static void main(String args[]) {
        JSONObject o1 = new JSONObject();
        JSONObject o2 = new JSONObject();
        JSONObject o3 = new JSONObject();
        JSONObject o4 = new JSONObject();

        o1.put("name", "Rasu");
        o1.put("id", 25);
        o1.put("total_salary",30500);
        o1.put("Seinor", true);


        JSONArray jsonArray=new JSONArray();
        jsonArray.add(300000);
        jsonArray.add(300050);
        jsonArray.add(305000);

        o1.put("salary",jsonArray);
        System.out.println(o1);


        o2.put("depart","comp");
        o2.put("block",9);
        o2.put("HOD","Hari");
        o2.put("Subject",5);
        System.out.println(o2);


        o3.put("libraryAllowence",true);
        o3.put("reNo",14258);
        o3.put("status",false);
        o3.put("ExamType","online");
        System.out.println(o3);







//        JSONObject employObj = new JSONObject();
//        employObj.put("employee",o1);
//
//        System.out.print(employObj);
//
//        //JSONObject employObj1 = new JSONObject();
//
//
//        JSONObject ob = new JSONObject();
//
//        ob.put("Web","frontBack");
//        ob.put("time","parttime");
//        ob.put("workingHrs",4);
//
//        JSONArray jsonArray=new JSONArray();
//        jsonArray.add("department",ob);
//
//
//
//
//
//
//
//

    }

}
