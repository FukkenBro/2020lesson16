
import java.util.HashSet;
import java.util.Set;

//3*) Написать метод:
//public int uniqueMorseRepresentations(String[] words) {
//        }
//        Unique Morse Code Words
//        International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
//        For convenience, the full table for the 26 letters of the English alphabet is given below:
//        [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
//        Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cba" can be written as "-.-..--...", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.
//        Return the number of different transformations among all words we have.
//        Example:
//        Input: words = ["gin", "zen", "gig", "msg"]
//        Output: 2
//        Explanation:
//        The transformation of each word is:
//        "gin" -> "--...-."
//        "zen" -> "--...-."
//        "gig" -> "--...--."
//        "msg" -> "--...--."
//        There are 2 different transformations, "--...-." and "--...--.".

public class Task3 {

    private static String[] morseAlphabet = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
    private static char[] latinAlphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private static String[] inputWords = new String[]{"gin", "zen", "gig", "msg"};

    public static void main(String[] args) {
        Set<String> hs = new HashSet<String>();
        for (int i = 0; i < inputWords.length; i++) {
            String s = latinToMorse(inputWords[i]);
            hs.add(s);
            System.out.println(s);
        }
        System.out.println("Number of unique combinations = " + hs.size());
    }

    public static String latinToMorse(String input) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < latinAlphabet.length; j++) {
                if (input.charAt(i) == latinAlphabet[j]) {
                    sb.append(morseAlphabet[j]);
                    break;
                }
            }
        }
        return sb.toString();
    }
}
