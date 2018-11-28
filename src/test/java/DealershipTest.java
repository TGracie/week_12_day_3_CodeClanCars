import Parts.Engine;
import Parts.FuelTank;
import Vehicles.Petrol;
import Vehicles.Vehicle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealer;
    Vehicle car;
    Petrol pet;
    Engine v8;
    FuelTank tank1;

    @Before
    public void before(){
        car = new Petrol("Jaguar", "XF", 27000.00, 4, v8, tank1);
        v8 = new Engine("Jaguar", "AJ-V8", 6000.00, 8, 4995, "V", 505);
        tank1 = new FuelTank("Jaguar", "Tank", 300.00, 65);

        dealer = new Dealership("Chips Whips", 65000.00);
    }

    @Test
    public void needsCars(){
        assertEquals(0, dealer.stockCount());
    }

    @Test
    public void canAddCars(){
        dealer.addCarToStock(car);
        assertEquals(1, dealer.stockCount());
    }

    @Test
    public void canRemoveCars(){
        canAddCars();
        dealer.removeFromStock(car);
        assertEquals(0, dealer.stockCount());
    }

}
