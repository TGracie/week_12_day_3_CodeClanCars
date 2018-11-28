import Parts.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine v8;

    @Before
    public void before(){
        v8 = new Engine("Dodge", "Demon", 15000.00, 8, 6995, "V", 1000);
    }

    @Test
    public void hasDetails(){
        assertEquals("Dodge", v8.getMake());
        assertEquals("Demon", v8.getModel());
        assertEquals(15000.00, v8.getPrice(), 0.1);
        assertEquals(8, v8.getCylinder());
        assertEquals(6995, v8.getDisplacement());
    }
}
