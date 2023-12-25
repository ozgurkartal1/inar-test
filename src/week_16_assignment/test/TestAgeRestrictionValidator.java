package week_16_assignment.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import week_16_assignment.java.AgeRestrictionAnalysis;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAgeRestrictionValidator {

    private AgeRestrictionAnalysis age;
    public static int numberOfTestCases = 0;
     @BeforeAll
     static void setUp(){

         System.out.println("Test Started!");
     }
     @BeforeEach
     void startTestCases(){
         numberOfTestCases++;
         System.out.println("Test Case " + numberOfTestCases + " Started!");
         age = new AgeRestrictionAnalysis();
     }

    @AfterEach
    void closeTestCases(){
        System.out.println("Test Case " + numberOfTestCases + " Finished!");
        age = null;
    }

    @AfterAll
    static void tearDown(){
        System.out.println("Test Finished!");
    }

    @ParameterizedTest
    @ValueSource(strings = {"17", "66", "100"})
    void TestAgeRestrictionValidatorWithInvalidAges(String input){
         boolean result = age.isEligible(Integer.parseInt(input));
         assertFalse(result, "Input : " + input + "\nMethod Rule : " +
                "18 <= input <= 65\nTC_" + numberOfTestCases + " Failed");
    }

    @ParameterizedTest
    @ValueSource(strings = {"18", "19", "64", "65"})
    void TestAgeRestrictionValidatorWithValidAges(int input){
         boolean result = age.isEligible(input);
        assertTrue(result, "Input : " + input + "\nMethod Rule " +
                "18 <= input <=65\nTC_" + numberOfTestCases + " Failed");
    }

}
