import Parts.Battery;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BatteryTest {

    Battery bat;

    @Before
    public void before(){
        bat = new Battery("BMW",  "LI", 5000.00, 120);
    }

    @Test
    public void hasCapacity(){
        assertEquals(120, bat.getCapacity());
    }
}
