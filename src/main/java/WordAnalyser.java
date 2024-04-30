import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordAnalyser {
    public static String[] findLongestWords(String text) {
        // TODO: Implement the logic to find the longest word(s) in the given text
        String[] splitWords = text.split("[\s,;]+");

        String longestWord ="";

        for (String word : splitWords){
            //System.out.println(word);
            if (word.length()>longestWord.length()){
                longestWord = word;
            }
        }
        ArrayList<String> allLongWords = new ArrayList<>();

        for (int i=0; i< splitWords.length; i++){
            if (splitWords[i].length() == longestWord.length()){
                allLongWords.add(splitWords[i]);
            }
        }

        String[] stringArray = allLongWords.toArray(new String[0]);
        return stringArray;
    }

    public static Map<Character, Integer> calculateLetterFrequency(String text) {
        // TODO: Implement the logic to calculate the frequency of each letter in the given text
        Map<Character, Integer> charcount = new HashMap<Character, Integer>();

        return charcount;
    }
}
