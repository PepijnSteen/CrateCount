import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class BottleInfoTest {

    @Test
    public void testGetName() {
        BottleInfo bottle = new BottleInfo("Coca-Cola", 1.50, 24);
        assertEquals("Coca-Cola", bottle.getName());
    }

    @Test
    public void testGetPrice() {
        BottleInfo bottle = new BottleInfo("Coca-Cola", 1.50, 24);
        assertEquals(1.50, bottle.getPrice(), 0.001);
    }

    @Test
    public void testGetAmount() {
        BottleInfo bottle = new BottleInfo("Coca-Cola", 1.50, 24);
        assertEquals(24, bottle.getAmount());
    }

    @Test
    public void testSetPrice() {
        BottleInfo bottle = new BottleInfo("Coca-Cola", 1.50, 24);
        bottle.setPrice(2.00);
        assertEquals(2.00, bottle.getPrice(), 0.001);
    }

    @Test
    public void testSetAmount() {
        BottleInfo bottle = new BottleInfo("Coca-Cola", 1.50, 24);
        bottle.setAmount(36);
        assertEquals(36, bottle.getAmount());
    }

}