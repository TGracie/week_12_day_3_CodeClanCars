import Parts.Battery;
import Parts.Engine;
import Parts.FuelTank;
import Parts.Motor;
import Vehicles.Hybrid;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridTest {

    Hybrid phev;
    Engine v8;
    Engine v6;
    FuelTank tank1;
    FuelTank tank2;
    Battery low;
    Battery high;
    Motor at;
    Motor sat;

    @Before
    public void before(){
        at = new Motor("BMW", "AT", 6000.00, 125);
        sat = new Motor("BMW", "AT", 7000.00, 135);
        low = new Battery("BMW", "AT", 3000.00, 120);
        high = new Battery("BMW", "SAT", 4000.00, 125);

        v8 = new Engine("Jaguar", "AJ-V8", 6000.00, 8, 4995, "V", 505);
        v6 = new Engine("Jaguar", "AJ-V6", 4000.00, 6, 2997, "V", 385);
        tank1 = new FuelTank("Jaguar", "Tank", 300.00, 65);
        tank2 = new FuelTank("Jaguar", "Tank", 250.00, 60);

        phev = new Hybrid("Mitsubishi", "Outlander-PHEV", 16000.00, 4, v6, tank1, at, low);
    }

    @Test
    public void basicBitch(){
        assertEquals(at, phev.getMotor());
        assertEquals(low, phev.getBattery());
        assertEquals(v6, phev.getEngine());
        assertEquals(tank1, phev.getTank());
    }

    @Test
    public void upgrade(){
        phev.setBattery(high);
        phev.setEngine(v8);
        phev.setMotor(sat);
        phev.setTank(tank2);
        assertEquals(sat, phev.getMotor());
        assertEquals(high, phev.getBattery());
        assertEquals(v8, phev.getEngine());
        assertEquals(tank2, phev.getTank());
    }
}
