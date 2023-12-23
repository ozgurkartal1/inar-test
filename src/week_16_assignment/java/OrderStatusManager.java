package week_16_assignment.java;

public class OrderStatusManager {
    public enum OrderState{
        NEW, PENDING, SHIPPED, DELIVERED, CANCELED
    }
     private OrderState currentState;

    public OrderStatusManager(OrderState currentState){

        this.currentState = currentState;
    }
    public void nextState(){
        switch (this.currentState){
            case NEW ->{
                this.currentState = OrderState.PENDING;
            }
            case PENDING -> {
                this.currentState = OrderState.SHIPPED;
            }
            case SHIPPED -> {
                this.currentState = OrderState.DELIVERED;
            }
            case DELIVERED, CANCELED ->{}
            default -> {
            }
        }

    }

    public OrderState getCurrentState(){
        return currentState;
    }

    public void cancelOrder() throws Exception {
        if(currentState.equals(OrderState.CANCELED)){
            throw new Exception("The product order is already canceled");
        }

        if(currentState.equals(OrderState.NEW) ||
                currentState.equals(OrderState.PENDING)){
            this.currentState = OrderState.CANCELED;
        }

    }
}
