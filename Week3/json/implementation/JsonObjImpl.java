package json.implementation;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonObjImpl {
    public static  void main(String[] args){
        JSONObject jsoNobject =new  JSONObject();
        jsoNobject.put("name ","Rab");
      // jsoNobject.put("num",new Integer(100));
        jsoNobject.put("age", 25);
        jsoNobject.put("bookBorrow",true);
        jsoNobject.put("address","Bkt");
        jsoNobject.put("salary",100000);

        JSONArray jsonArray = new JSONArray();
        jsonArray.add("Java");
        jsonArray.add("Servlet");
        jsonArray.add("JSP");
        jsonArray.add("Hibernet");

        jsoNobject.put("courses",jsonArray);
        System.out.println(jsoNobject);
    }


}
