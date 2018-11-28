import Parts.Engine;
import Parts.FuelTank;
import Vehicles.Petrol;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolTest {

    Petrol pet;
    Engine v8;
    Engine v6;
    FuelTank tank1;
    FuelTank tank2;

    @Before
    public void before(){
        v8 = new Engine("Jaguar", "AJ-V8", 6000.00, 8, 4995, "V", 505);
        v6 = new Engine("Jaguar", "AJ-V6", 4000.00, 6, 2997, "V", 385);
        tank1 = new FuelTank("Jaguar", "Tank", 300.00, 65);
        tank2 = new FuelTank("Jaguar", "Tank", 250.00, 60);
        pet = new Petrol("Jaguar", "XF", 27000.00, 4, v8, tank1);
    }

    @Test
    public void hasV8AndTank1(){
        assertEquals(v8, pet.getEngine());
        assertEquals(tank1, pet.getTank());
    }

    @Test
    public void sacrilege(){
        pet.setEngine(v6);
        pet.setTank(tank2);
        assertEquals(v6, pet.getEngine());
        assertEquals(tank2, pet.getTank());
    }
}
