import org.junit.Test;
import static org.junit.Assert.*;

public class WordInStringTest {

    @Test
    public void testWordInString() {
        String sentence = "hello world";
        assertTrue(sentence.contains("hello"));
    }

    @Test
    public void testWordNotInString() {
        String sentence = "hello world";
        assertFalse(sentence.contains("cat"));
    }

    @Test
    public void testWordInEmptyString() {
        String sentence = "";
        assertFalse(sentence.contains("hello"));
    }

    @Test
    public void testNullString() {
        String sentence = null;
        assertFalse(sentence.contains("hello"));
    }
    
    @Test
    public void testWordInStringCaseSensitive() {
        String sentence = "hello world";
        assertFalse(sentence.contains("Hello"));
    }

    @Test
    public void testWordInStringCaseInsensitive() {
        String sentence = "hello world";
        assertTrue(sentence.toLowerCase().contains("hello"));
    }
    
    @Test
    public void testWordWithSpecialCharacters() {
        String sentence = "hello world";
        assertTrue(sentence.contains("hello!"));
    }
}
