import Parts.FuelTank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FuelTankTest {

    FuelTank tank;


    @Before
    public void before(){
        tank = new FuelTank("Ford", "XR3i tank", 99.00, 50);
    }

    @Test
    public void hasVolume(){
        assertEquals(50, tank.getVolume());
    }
}
