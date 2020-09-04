package json.structure;



import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;


//id" : 121,
//        "name": "Sabina",
//        "libraryActive": true,
//        "gender": "Female",
//        "age": 30,
//        "email" : "sabina@gmail.com",
//        "phone" : "+977253682",
//        "address":["Bhaktapur","Kathmandu"],
//        "borrowBook": true,
//        "fineOnBook": false,
//        "bookName":
public class JsonDemo {
    int id;
    String name;
    boolean libraryActive;
    String gender;
    int age;
    String email;
    LinkedHashSet<Address> address;
    boolean borrowBook;
    boolean fineOnBook;
    //List<BookInfo> bookInfo;
    Map<String, Integer> bookInfo;
    String department;


    public JsonDemo(int id, String name, boolean libraryActive, String gender, int age, String email, LinkedHashSet<Address> address,boolean borrowBook, boolean fineOnBook, Map<String , Integer> bookInfo,String department) {

        this.id = id;
        this.name =name;
        this.libraryActive =libraryActive;
        this.gender = gender;
        this.age = age;
        this.email = email;
        this.address = address;
        this.borrowBook = borrowBook;
        this.fineOnBook = fineOnBook;
        this.bookInfo = bookInfo;
        this.department = department;

    }
}
