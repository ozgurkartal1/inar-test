package week_16_assignment.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import week_16_assignment.java.ShippingCostCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestShippingCostCalculator {

    private ShippingCostCalculator calculator;

    @BeforeAll
    static void setUp(){
        System.out.println("TEST STARTED!");
    }

    @BeforeEach
    void startTestCase(){
        System.out.println("Test Case Started!");
        calculator = new ShippingCostCalculator();
    }

    @AfterEach
    void finishTestCase(){
        System.out.println("Test Case Finished!");
        calculator = null;
    }

    @AfterAll
    static void tearDown(){
        System.out.println("TEST FINISHED!");
    }

    @Test
    void testShippingCostForNegativeWeightForLocalDestinationWithStandardDelivery() throws Exception {
        assertThrows(Exception.class, ()-> {
            double result = calculator.calculateCost(-1, "local", "standard");
        });
    }

    @Test
    void testShippingCostForNegativeWeightForLocalDestinationWithExpressDelivery() throws Exception {
        assertThrows(Exception.class, ()-> {
            double result = calculator.calculateCost(-1, "local", "express");
        });
    }

    @Test
    void testShippingCostForNegativeWeightForInternationalDestinationWithStandardDelivery() throws Exception {
        assertThrows(Exception.class, ()-> {
            double result = calculator.calculateCost(-1, "international", "standard");
        });
    }

    @Test
    void testShippingCostForNegativeWeightForInternationalDestinationWithExpressDelivery() throws Exception {
        assertThrows(Exception.class, ()-> {
            double result = calculator.calculateCost(-1, "international", "express");
        });
    }

    @ParameterizedTest
    @CsvSource({"0, Local, Express",
                "0, International, Standard",
                "0, Local, Standard",
                "0, International, Express"})
    void Test(double weight, String destination, String deliverySpeed) throws Exception{
        assertThrows(Exception.class, ()->{
            calculator.calculateCost(weight, destination, deliverySpeed);
        });
    }

    @ParameterizedTest
    @CsvSource({"1, Local, Express, 2.5",
                "2, Local, Standard, 2",
                "2, International, Standard, 10",
                "2, International, Express, 25"})
    void Test1(double weight, String destination, String deliverSpeed, double expectedResult) throws Exception {
        assertEquals(expectedResult, calculator.calculateCost(weight, destination, deliverSpeed));
    }
}
