package week_16_assignment.java;

public class ShippingCostCalculator {
    private static final double LOCAL_RATE = 1.0;
    private static final double INTERNATIONAL_RATE = 5.0;
    private static final double STANDARD_RATE = 1.0;
    private static final double EXPRESS_RATE = 2.5;

    public double calculateCost(double weight, String destination, String deliverySpeed) {
        double cost = 0.0;

        //Determine the base cost by destination;

        if("Local".equalsIgnoreCase(destination)){
            cost += weight * LOCAL_RATE;
        } else if ("International".equalsIgnoreCase(destination)) {
            cost += weight * INTERNATIONAL_RATE;
        }

        //Apply the multiplier for delivery Speed

        if("Standard".equalsIgnoreCase(deliverySpeed)){
            cost *= STANDARD_RATE;
        }else if("Express".equalsIgnoreCase(deliverySpeed)){
            cost *= EXPRESS_RATE;
        }

        return cost;
    }
}
