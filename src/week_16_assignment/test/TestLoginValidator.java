package week_16_assignment.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import week_16_assignment.java.LoginValidator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLoginValidator {

    private LoginValidator loginValidator;
    @BeforeAll
    static void setup(){
        System.out.println("Test started!");
    }

    @AfterAll
    static void finishTest(){
        System.out.println("Test finished");
    }

    @BeforeEach
    void createObjOfLoginValidator(){
        loginValidator = new LoginValidator();
        System.out.println("Test Case Started");
    }

    @AfterEach
    void removeObj(){
        loginValidator = null;
        System.out.println("Test Case Finished");
        System.out.println("--------------------------");
    }

    @Test
    void TestLoginValidatorWithValidUsername(){
        assertTrue(loginValidator.isValidUserName("user@gmail.com"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"usergmail.com", "user@", "usergmail.com", "",})
    void TestLoginValidatorWithInvalidUsernames(String input){
        assertFalse(loginValidator.isValidUserName(input), "Entered Value : " + input +
                " This test case failed!");
    }

    @Test
    void TestLoginValidatorWithNullEmail(){
        assertFalse(loginValidator.isValidUserName(null));
    }

    // Test Cases For validatePassword method

    @ParameterizedTest
    @ValueSource(strings = {"special1", "special&", "speci1&", "special11111111111@", ""})
    void TestLoginValidatorWithInvalidPasswords(String input){
        boolean result = loginValidator.isValidPassword(input);
        assertFalse(result, "Entered Value : " + input + "\nMethod Rule : Length of Password must be between" +
                "8 and 16 characters \nand it should contains at least one special character and one number\n" +
                "This Test Case failed!");

    }

    @Test
    void TestLoginValidatorWithNullPassword(){
        assertFalse(loginValidator.isValidPassword(null));
    }

}
