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
import static org.junit.Assert.assertNotNull;


public class AppTest {
    @Test public void testAppHasAGreeting() throws FileNotFoundException {
           App json = new App();
        Gson gson = new Gson();
        File file = new File("app\\src\\main\\resources\\recentquotes.json");

            assertEquals("Should return random book from recentQuestes.json", null ,json.randomBook(gson, file));
    }

}
