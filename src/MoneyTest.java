import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    public MoneyTest() {

    }

    @Test
    public void testMultiplication() {

        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
