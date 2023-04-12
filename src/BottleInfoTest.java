import org.junit.Test;
import static org.junit.Assert.*;

public class BottleInfoTest {

    @Test
    public void testConstructorAndGetters() {
        //Arrange en Act
        BottleInfo bottleInfo = new BottleInfo("Coca Cola", 2.50, 12);
        //Assert
        assertEquals("Coca Cola", bottleInfo.getName());
        assertEquals(2.50, bottleInfo.getPrice(), 0.01);
        assertEquals(12, bottleInfo.getAmount());
    }

    @Test
    public void testSetName() {
        //Arrange
        BottleInfo bottleInfo = new BottleInfo("Coca Cola", 2.50, 12);
        //Act
        bottleInfo.setName("Pepsi");
        //Assert
        assertEquals("Pepsi", bottleInfo.getName());
    }

    @Test
    public void testSetPrice() {
        //Arrange
        BottleInfo bottleInfo = new BottleInfo("Coca Cola", 2.50, 12);
        //Act
        bottleInfo.setPrice(2.75);
        //Assert
        assertEquals(2.75, bottleInfo.getPrice(), 0.01);
    }

    @Test
    public void testSetAmount() {
        //Arrange
        BottleInfo bottleInfo = new BottleInfo("Coca Cola", 2.50, 12);
        //Act
        bottleInfo.setAmount(24);
        //Assert
        assertEquals(24, bottleInfo.getAmount());
    }

    @Test
    public void testToString() {
        //Arrange
        BottleInfo bottleInfo = new BottleInfo("Coca Cola", 2.50, 12);
        //Act
        String expected = "name= 'Coca Cola', price= 2.5, amount= 12";
        //Assert
        assertEquals(expected, bottleInfo.toString());
    }
}