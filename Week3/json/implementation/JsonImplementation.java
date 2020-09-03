package json.implementation;

import arrayList.linkedList.example.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class JsonImplementation {
    public  static void main(String[] args) throws FileNotFoundException {
        JSONObject obj = new JSONObject();
        obj.put("firstname","Jhon");
        obj.put("lastnmae","Shresttha");
        obj.put("age",56);


        Map map = new HashMap();
        map.put("Street","Bhaktapur");
        map.put("zipcode",448800);
        map.put("provinces",3);
        map.put("zone","Bagmati");

        obj.put("address",map); // assignened on main obj

        JSONArray jsonArray = new JSONArray();
        map = new HashMap();
        map.put("type","home");
        map.put("mobile",258528528L);
        map.put("phone",252525);

        jsonArray.add(map);//assigned on array obj

        map = new HashMap();
        map.put("type","office");
        map.put("mobile",258528555528L);
        map.put("phone",45252525);

        jsonArray.add(map);//assigned on array obj yo pani

        obj.put("phoneno",jsonArray);

        System.out.println(obj);

        //Prints formatted representations of objects to a text-output stream
//        PrintWriter printWriter = new PrintWriter("JSONExample.json");
//        printWriter.write(obj.toJSONString());
//
//        printWriter.flush();//flush() method of OutputStream class is used to flush the content of the buffer to the output stream
//        printWriter.close();//close() method of Reader Class in Java is used to close the stream and release the resources that were busy in the stream,


    }
}
