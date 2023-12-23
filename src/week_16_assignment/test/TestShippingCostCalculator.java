package week_16_assignment.test;

import org.junit.jupiter.api.Test;
import week_16_assignment.java.ShippingCostCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestShippingCostCalculator {
    private final ShippingCostCalculator cost = new ShippingCostCalculator();

    @Test
    void testShippingCostForLocalDestinationWithStandardDelivery() throws Exception {
        double result = cost.calculateCost(10, "Local", "standard");
        assertEquals(result, 10);
    }

    @Test
    void testShippingCostForLocalDestinationWithExpressDelivery() throws Exception {
        double result = cost.calculateCost(10, "Local", "express");
        assertEquals(result, 25);
    }

    @Test
    void testShippingCostForInternationalDestinationWithStandardDelivery() throws Exception {
        double result = cost.calculateCost(10, "international", "standard");
        assertEquals(result, 50);
    }

    @Test
    void testShippingCostForInternationalDestinationWithExpressDelivery() throws Exception {
        double result = cost.calculateCost(10, "international", "Express");
        assertEquals(result, 125);
    }
    @Test
    void testShippingCostFor0WeightForLocalDestinationWithStandardDelivery() throws Exception {
        assertThrows(Exception.class, ()-> {
            double result = cost.calculateCost(0, "local", "standard");
        });
        }

    @Test
    void testShippingCostFor0WeightForLocalDestinationWithExpressDelivery() throws Exception {
        assertThrows(Exception.class, ()-> {
            double result = cost.calculateCost(0, "local", "Express");
        });
    }

    @Test
    void testShippingCostFor0WeightForInternationalDestinationWithStandardDelivery() throws Exception {
        assertThrows(Exception.class, ()-> {
            double result = cost.calculateCost(0, "international", "standard");
        });
    }

    @Test
    void testShippingCostFor0WeightForInternationalDestinationWithExpressDelivery() throws Exception {
        assertThrows(Exception.class, ()-> {
            double result = cost.calculateCost(0, "international", "Express");
        });
    }

    @Test
    void testShippingCostForNegativeWeightForLocalDestinationWithStandardDelivery() throws Exception {
        assertThrows(Exception.class, ()-> {
            double result = cost.calculateCost(-1, "local", "standard");
        });
    }

    @Test
    void testShippingCostForNegativeWeightForLocalDestinationWithExpressDelivery() throws Exception {
        assertThrows(Exception.class, ()-> {
            double result = cost.calculateCost(-1, "local", "express");
        });
    }

    @Test
    void testShippingCostForNegativeWeightForInternationalDestinationWithStandardDelivery() throws Exception {
        assertThrows(Exception.class, ()-> {
            double result = cost.calculateCost(-1, "international", "standard");
        });
    }

    @Test
    void testShippingCostForNegativeWeightForInternationalDestinationWithExpressDelivery() throws Exception {
        assertThrows(Exception.class, ()-> {
            double result = cost.calculateCost(-1, "international", "express");
        });
    }

    }

