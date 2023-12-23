package main.test;

import main.java.Discount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDiscount {

    @Test
    void TestClothingDiscountForStudents(){
        double result = Discount.calculatePriceAfterDiscount("Student", "Clothing", 100);
        assertEquals(result, 80);
    }


}
