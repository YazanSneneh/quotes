/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.gson.Gson;
import org.junit.Test;
import quotes.Book;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.Assert.assertEquals;


public class AppTest {
    App json = new App();
    Gson gson = new Gson();
    File file = new File("src\\main\\resources\\recentquotes.json");



//    @Test public void testAppHasAGreeting() throws FileNotFoundException {
//        assertEquals("expected book in index 0:", json.randomBook(gson, file), json.randomBook(gson, file));
//    }
   @Test public void testGetBook()throws FileNotFoundException {
         assertEquals("expected book in index 0:", json.getBook(gson, file,0), json.getBook(gson, file,0));
     }
}