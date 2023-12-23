package main.java;

public class Discount {

    public static double calculatePriceAfterDiscount(String typeOfStatus, String typeOfProduct, double price){
        double discount = 0.0;
        if(typeOfStatus.equals("Student") && typeOfProduct.equals("Clothing")){
            discount = 20.0;
        }

        if(typeOfStatus.equals("Student") && typeOfProduct.equals("Electronics")){
            discount = 10.0;
        }

        if(typeOfStatus.equals("Adult".toLowerCase()) && typeOfProduct.equals("Clothing")){
            discount = 10.0;
        }

        if (typeOfStatus.equals("Adult".toLowerCase()) && typeOfProduct.equals("Electronics")){
            discount = 5.0;
        }

        return price * (100 - discount) / 100;
    }
}
