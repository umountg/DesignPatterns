package lv.nikolay.designpatterns.structuraldesignpatterns.bridge;

import org.junit.Before;
import org.junit.Test;

public class BridgeTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testAuto() {
        Vehicle vehicle = new BigBus(new SmallEngine());
        vehicle.drive();
        vehicle.setEngine(new BigEngine());
        vehicle.drive();

        vehicle = new SmallCar(new SmallEngine());
        vehicle.drive();
        vehicle.setEngine(new BigEngine());
        vehicle.drive();
    }
}
