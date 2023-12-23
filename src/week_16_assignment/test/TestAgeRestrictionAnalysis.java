package week_16_assignment.test;

import org.junit.jupiter.api.Test;
import week_16_assignment.java.AgeRestrictionAnalysis;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAgeRestrictionAnalysis {

    private final AgeRestrictionAnalysis restrictionObj = new AgeRestrictionAnalysis();


    @Test
    void testAgeJustBelowMinimum(){
        boolean result = restrictionObj.isEligible(17);
        assertFalse(result);
    }
    @Test
    void testAgeAtMinimumBoundary(){
        boolean result = restrictionObj.isEligible(18);
        assertTrue(result);
    }
    @Test
    void testAgeJustAboveMinimum(){
        boolean result = restrictionObj.isEligible(19);
        assertTrue(result);
    }
    @Test
    void testAgeJustBelowMaximum(){
        boolean result = restrictionObj.isEligible(64);
        assertTrue(result);
    }
    @Test
    void testAgeAtMaximumBoundary(){
        boolean result = restrictionObj.isEligible(65);
        assertTrue(result);
    }

    @Test
    void testAgeJustAboveMaximum(){
        boolean result = restrictionObj.isEligible(66);
        assertFalse(result);
    }

    @Test
    void TestExtremeLowAge(){
        boolean result = restrictionObj.isEligible(0);
        assertFalse(result);
    }

    @Test
    void TestExtremeHighAge(){
        boolean result = restrictionObj.isEligible(100);
        assertFalse(result);
    }
}
