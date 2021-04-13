package quotes;

import java.util.ArrayList;

public class Book {
     ArrayList<String> tags = new ArrayList<>();
     String author ;
     String  likes ;
     String text ;


     @Override
     public String toString() {
          return "Book{" +
                  "tags=" + tags +
                  ", author='" + author + '\'' +
                  ", likes='" + likes + '\'' +
                  ", text='" + text + '\'' +
                  '}';
     }
}
