package week_16_assignment.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import week_16_assignment.java.OrderStatusManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOrderStatusManager {

    private OrderStatusManager manager;

    @BeforeAll
    static void setUp(){
        System.out.println("TEST STARTED!");
    }

    @BeforeEach
    void startTestCase(){
        System.out.println("Test Case Started!");
        manager = new OrderStatusManager();
    }

    @AfterEach
    void finishTestCase(){
        System.out.println("Test case finished!");
        manager = null;
    }

    @AfterAll
    static void tearDown(){
        System.out.println("Test FINISHED!");
    }

    @Test
    void testNoTransitionFromDeliveredStep(){
        OrderStatusManager.OrderState result = manager.nextState(OrderStatusManager.OrderState.DELIVERED);
        assertEquals(OrderStatusManager.OrderState.DELIVERED, result);
    }

    @Test
    void testNoTransitionFromCancelledStep(){
        OrderStatusManager.OrderState result = manager.nextState(OrderStatusManager.OrderState.CANCELLED);
        assertEquals(OrderStatusManager.OrderState.CANCELLED, result);
    }

    @ParameterizedTest
    @CsvSource({"NEW, PENDING",
                "PENDING, SHIPPED",
                "SHIPPED, DELIVERED"})
    void testTransitionOfNextState(OrderStatusManager.OrderState input,
                                   OrderStatusManager.OrderState expectedResult){
        OrderStatusManager.OrderState result = manager.nextState(input);
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({"NEW, CANCELLED",
                "PENDING, CANCELLED",
                "SHIPPED, SHIPPED",
                "DELIVERED, DELIVERED",
                "CANCELLED, CANCELLED"})

    void testCancelOrderMethodForOrderSteps(OrderStatusManager.OrderState input,
                                            OrderStatusManager.OrderState expectedResult){

        assertEquals(expectedResult ,manager.cancelOrder(input));

    }
}
