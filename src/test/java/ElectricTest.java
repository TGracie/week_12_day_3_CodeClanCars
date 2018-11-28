import Parts.Battery;
import Parts.Motor;
import Vehicles.Electric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricTest {

    Electric leccy;
    Motor at;
    Motor sat;
    Battery low;
    Battery high;

    @Before
    public void before(){
        at = new Motor("BMW", "AT", 6000.00, 125);
        sat = new Motor("BMW", "AT", 7000.00, 135);

        low = new Battery("BMW", "AT", 3000.00, 120);
        high = new Battery("BMW", "SAT", 4000.00, 125);

        leccy = new Electric("BMW", "i3", 12000.00, 4, at, low);
    }

    @Test
    public void startSmall(){
        assertEquals(low, leccy.getBattery());
        assertEquals(at, leccy.getMotor());
    }

    @Test
    public void startedFromTheBottomNowWeHere(){
        leccy.setBattery(high);
        leccy.setMotor(sat);
        assertEquals(high, leccy.getBattery());
        assertEquals(sat, leccy.getMotor());
    }
}
