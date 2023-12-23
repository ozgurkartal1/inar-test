package week_16_assignment.test;

import org.junit.jupiter.api.Test;
import week_16_assignment.java.OrderStatusManager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestOrderStatusManager {

    @Test
    void testOrderStateTransitionFromNewToPending(){
        OrderStatusManager manager = new OrderStatusManager(OrderStatusManager.OrderState.NEW);
        manager.nextState();
        assertEquals(OrderStatusManager.OrderState.PENDING, manager.getCurrentState(),
                "State should transition from NEW to PENDING");
    }

    @Test
    void testOrderStateTransitionFromPendingToShipped(){
        OrderStatusManager manager = new OrderStatusManager(OrderStatusManager.OrderState.PENDING);
        manager.nextState();
        assertEquals(OrderStatusManager.OrderState.SHIPPED, manager.getCurrentState(),
                "State should transition from PENDING to SHIPPED");
    }

    @Test
    void testOrderStateTransitionFromShippedToDelivered(){
        OrderStatusManager manager = new OrderStatusManager(OrderStatusManager.OrderState.SHIPPED);
        manager.nextState();
        assertEquals(OrderStatusManager.OrderState.DELIVERED, manager.getCurrentState(),
                "State transition from SHIPPED to DELIVERED");
    }

    @Test
    void testNoTransitionFromDelivered(){
        OrderStatusManager manager = new OrderStatusManager(OrderStatusManager.OrderState.DELIVERED);
        manager.nextState();
        assertEquals(OrderStatusManager.OrderState.DELIVERED, manager.getCurrentState(),
                "State can not make transition from DELIVERED");
    }

    @Test
    void testNoTransitionFromCanceled(){
        OrderStatusManager manager = new OrderStatusManager(OrderStatusManager.OrderState.CANCELED);
        manager.nextState();
        assertEquals(OrderStatusManager.OrderState.CANCELED, manager.getCurrentState(),
                "State can not make transition from CANCELED");
    }

    // Test For cancelOrder Method

    @Test
    void testCancelFromNewState() throws Exception {
        OrderStatusManager manager = new OrderStatusManager(OrderStatusManager.OrderState.NEW);
        manager.cancelOrder();
        assertEquals(OrderStatusManager.OrderState.CANCELED, manager.getCurrentState(),
                "You can make cancellation from NEW");
    }

    @Test
    void testCancelFromPendingState() throws Exception {
        OrderStatusManager manager = new OrderStatusManager(OrderStatusManager.OrderState.PENDING);
        manager.cancelOrder();
        assertEquals(OrderStatusManager.OrderState.CANCELED, manager.getCurrentState(),
                "You can make cancellation from PENDING");
    }

    @Test
    void testNoCancellationFromShippedStatus() throws Exception {
        OrderStatusManager manager = new OrderStatusManager(OrderStatusManager.OrderState.SHIPPED);
        manager.cancelOrder();
        assertEquals(OrderStatusManager.OrderState.SHIPPED, manager.getCurrentState(),
                "You can not make cancellation from SHIPPED");
    }
    @Test
    void testNoCancellationFromDeliveredStatus() throws Exception {
        OrderStatusManager manager = new OrderStatusManager(OrderStatusManager.OrderState.DELIVERED);
        manager.cancelOrder();
        assertEquals(OrderStatusManager.OrderState.DELIVERED, manager.getCurrentState(),
                "You can not make cancellation from DELIVERED");
    }

    @Test
    void testNoCancellationFromCancelledStatus() throws Exception {
        OrderStatusManager manager = new OrderStatusManager(OrderStatusManager.OrderState.CANCELED);
        assertThrows(Exception.class, ()->{
            manager.cancelOrder();
        }, "You can not make cancellation for the product is cancelled before");
    }


}
