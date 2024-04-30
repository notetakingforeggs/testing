import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class WordAnalyserTest {
// hyphens count as characters
    @Test
    void findLongestWords() {
        assertAll(()-> assertArrayEquals(new String[] {"pineapple"}, WordAnalyser.findLongestWords("apple banana grape kiwi pineapple")),
                () -> assertArrayEquals(new String[]{"Manchester","Birmingham"}, WordAnalyser.findLongestWords("London, Manchester, Edinburgh, Birmingham, Liverpool, Leicester ")),
                () -> assertArrayEquals(new String[]{"Lamborghini"}, WordAnalyser.findLongestWords("Audi; BMW; Mercedes; Citeron; Volkswagen; Lamborghini")),
                () -> assertArrayEquals(new String[]{"brother-in-law"}, WordAnalyser.findLongestWords("fromage-frais, check-in, far-fetched, brother-in-law, electricity")));
    }

    @Test
    void calculateLetterFrequency() {
        HashMap<Character, Integer> checkTest1 = new HashMap<>();
        checkTest1.put('a',2);
        checkTest1.put('b',1);
        checkTest1.put('c',1);

        HashMap<Character, Integer> checkTest2 = new HashMap<>();
        checkTest2.put('a',1);
        checkTest2.put('d',4);
        checkTest2.put('h',2);
        checkTest2.put('g',2);
        checkTest2.put('k',2);
        checkTest2.put('e',2);
        checkTest2.put('n',2);
        checkTest2.put('j',1);

        HashMap<Character, Integer> checkTest3 = new HashMap<>();
        checkTest3.put('d',1);
        checkTest3.put('g',1);
        checkTest3.put('k',1);
        checkTest3.put('j',1);
        checkTest3.put('a',3);

        HashMap<Character, Integer> checkTest4 = new HashMap<>();
        checkTest4.put('t',1);
        checkTest4.put('h',1);
        checkTest4.put('e',1);
        checkTest4.put('m',1);
        checkTest4.put('o',2);
        checkTest4.put('n',1);


        HashMap<Character, Integer> checkTest5 = new HashMap<>();

        assertAll(() -> {   assertEquals(checkTest1, WordAnalyser.calculateLetterFrequency("aabc"));
                            assertEquals(checkTest2, WordAnalyser.calculateLetterFrequency("adhg GHken Jkddned"));
                            assertEquals(checkTest3,WordAnalyser.calculateLetterFrequency("dg, kj, aaa") );
                            assertEquals(checkTest4,WordAnalyser.calculateLetterFrequency("The Moon!") );
                            assertEquals(checkTest5, WordAnalyser.calculateLetterFrequency("") ) ;}
        );
    }
}