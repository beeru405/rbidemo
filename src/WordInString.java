public class WordInString {
    
    public static boolean containsWord(String sentence, String wordToFind) {
        if (sentence == null || wordToFind == null) {
            return false;
        }
        return sentence.contains(wordToFind);
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        String wordToFind = "quick";
        boolean isWordFound = containsWord(sentence, wordToFind);
        if (isWordFound) {
            System.out.println("The word '" + wordToFind + "' was found in the sentence.");
        } else {
            System.out.println("The word '" + wordToFind + "' was not found in the sentence.");
        }
    }
}
