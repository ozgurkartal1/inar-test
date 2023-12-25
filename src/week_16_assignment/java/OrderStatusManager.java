package week_16_assignment.java;

public class OrderStatusManager {
    public enum OrderState {
        NEW, PENDING, SHIPPED, DELIVERED, CANCELLED
    }
    public OrderState nextState(OrderState currentState) {
        switch (currentState) {
            case NEW -> {return OrderState.PENDING;}
            case PENDING-> {return OrderState.SHIPPED;}
            case SHIPPED->{return OrderState.DELIVERED;}
            default-> {return currentState;}
        }
    }


    public OrderState cancelOrder(OrderState currentState) {

        if (currentState == OrderState.NEW || currentState == OrderState.PENDING) {
            return OrderState.CANCELLED;
        } else {

            return currentState;
        }
    }

}



