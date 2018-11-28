import Parts.Motor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MotorTest {

    Motor tank;


    @Before
    public void before(){
        tank = new Motor("Siemens", "Azure", 8995.00, 200);
    }

    @Test
    public void hasRating(){
        assertEquals(200, tank.getRating());
    }
}