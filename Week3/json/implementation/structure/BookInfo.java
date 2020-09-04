package json.structure;

public class BookInfo {

     long bookId;
     String bookName;
     String bookAuthor;

     BookInfo(long bookId, String bookAuthor, String bookName) {
         this.bookId =bookId;
         this.bookAuthor = bookAuthor;
         this.bookName = bookName;
     }

}
