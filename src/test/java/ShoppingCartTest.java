import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    void addItems() {
        HashMap<String, Double> checkTest1 = new HashMap<>();
        
        HashMap<String, Double> checkTest2 = new HashMap<>();
        
        HashMap<String, Double> checkTest3 = new HashMap<>();
        
        
        assertAll(() -> {
                    assertEquals(checkTest1, ShoppingCart.addItems("aabc"));
                    assertEquals(checkTest2, ShoppingCart.addItems("adhg GHken Jkddned"));
                    assertEquals(checkTest3, ShoppingCart.addItems("dg, kj, aaa"));
                    });
    }
    @Test
    void calculateTotalPrice() {
    }
}