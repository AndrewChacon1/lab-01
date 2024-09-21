package u;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import c.HybridVehicle;

public class HybridVehicleTests {

    HybridVehicle hybrid;

    @Before
    public void setUp() {

        hybrid = new HybridVehicle(20.0, 60.0); 
    }

    @Test
    public void testFuelCost() {
        double pricePerGallon = 4.0;
        double gallons = 15.0;
        double expectedCost = 60.0;
        assertEquals(expectedCost, hybrid.fuelCost(pricePerGallon, gallons), 0.0001);
    }

    @Test
    public void testChargeCost() {
        // New test case values
        double pricePerKWh = 0.20;
        double kWh = 50.0;
        double expectedCost = 10.0;
        assertEquals(expectedCost, hybrid.chargeCost(pricePerKWh, kWh), 0.0001);
    }

    @Test
    public void testTotalCost() {
        // New test case values
        double pricePerGallon = 4.0;
        double gallons = 15.0;
        double pricePerKWh = 0.20;
        double kWh = 50.0;
        double expectedCost = 70.0;
        assertEquals(expectedCost, hybrid.totalCost(pricePerGallon, gallons, pricePerKWh, kWh), 0.0001);
    }
}
