import org.junit.Test;
import static org.junit.Assert.*;

public class WordInStringTest {

    @Test
    public void testWordInString() {
        String sentence = "The quick brown fox jumps over the lazy dog";
        assertTrue(sentence.contains("quick"));
    }

    @Test
    public void testWordNotInString() {
        String sentence = "The quick brown fox jumps over the lazy dog";
        assertFalse(sentence.contains("cat"));
    }

    @Test
    public void testWordInEmptyString() {
        String sentence = "";
        assertFalse(sentence.contains("quick"));
    }

    @Test
    public void testNullString() {
        String sentence = null;
        assertFalse(sentence.contains("quick"));
    }
    
    @Test
    public void testWordInStringCaseSensitive() {
        String sentence = "The quick brown fox jumps over the lazy dog";
        assertFalse(sentence.contains("Quick"));
    }

    @Test
    public void testWordInStringCaseInsensitive() {
        String sentence = "The quick brown fox jumps over the lazy dog";
        assertTrue(sentence.toLowerCase().contains("quick"));
    }
    
    @Test
    public void testWordWithSpecialCharacters() {
        String sentence = "The quick brown fox jumps over the lazy dog!";
        assertTrue(sentence.contains("lazy dog!"));
    }
}
