package main.test;

import main.java.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaCalculator {
    Calculator calculatorObj = new Calculator();
    @Test
    void testAdd(){

        int result = calculatorObj.add(2, 6);
        assertEquals(result, 8);
    }
    @Test
    void testSubtract(){
        int result = calculatorObj.subtract(6, 4);
        assertEquals(result, 2, "Test Case_02 6 - 4 must be 2");
    }
}
