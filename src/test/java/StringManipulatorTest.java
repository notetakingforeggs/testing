import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @Test
    void reverseString() {
        assertAll(() -> assertEquals("neerg", StringManipulator.reverseString("green")),
                () -> assertEquals("eohS", StringManipulator.reverseString("Shoe")),
                () -> assertEquals("AIRBMUC", StringManipulator.reverseString("CUMBRIA")),
                () -> assertEquals("!NodNoL", StringManipulator.reverseString("LoNdoN!")));
    }
    @Test
    void isPalindrome() {

            assertAll(()-> assertEquals(false, StringManipulator.isPalindrome("Coders")),
                    ()-> assertEquals(true,StringManipulator.isPalindrome("racecar")),
                    ()-> assertEquals(false, StringManipulator.isPalindrome("Leicester")),
                    ()-> assertEquals( true, StringManipulator.isPalindrome("HanNah")));
        }
    }
