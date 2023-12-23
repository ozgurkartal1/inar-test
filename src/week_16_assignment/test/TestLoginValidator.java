package week_16_assignment.test;

import org.junit.jupiter.api.Test;
import week_16_assignment.java.LoginValidator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLoginValidator {

    LoginValidator loginValidator = new LoginValidator();

    // Test Cases For validateUsername Method

    @Test
    void testUsernameWithValidEmail(){
        boolean result = loginValidator.
                isValidUserName("ozgurkartal515@gmail.com");
        assertTrue(result);

    }

    @Test
    void testUsernameWithoutSymbol(){
        boolean result = loginValidator.
                isValidUserName("ozgurkartal515gmail.com");
        assertFalse(result);
    }

    @Test
    void testUsernameWithoutDomain(){
        boolean result = loginValidator.
                isValidUserName("ozgurkartal515");
        assertFalse(result);
    }
    @Test
    void testUsernameWithInvalidCharacters(){
        boolean result = loginValidator.
                isValidUserName("özgürkartal515@gmail.com");
        assertFalse(result);
    }

    @Test
    void testUsernameWithEmptyEmailString(){
        boolean result = loginValidator.isValidUserName("");
        assertFalse(result);
    }

    @Test
    void testUsernameWithNullEmailAddress(){
        boolean result = loginValidator.isValidUserName(null);
        assertFalse(result);
    }

    // Test Cases for validatePassword Method

    @Test
    void testPasswordWithValidPassword(){
        boolean result = loginValidator.
                isValidPassword("Galatasaray1!");
        assertTrue(result);
    }

    @Test

    void testPasswordWithoutSpecialCharacter(){
        boolean result = loginValidator.isValidPassword("Galatasaray1");
        assertFalse(result);
    }

    @Test
    void testPasswordWithoutNumber(){
        boolean result = loginValidator.isValidPassword("Galatasaray!");
        assertFalse(result);
    }

    @Test
    void testPasswordWithLessThan8Characters(){
        boolean result = loginValidator.isValidPassword("Galat1!");
        assertFalse(result);
    }
    @Test
    void testPasswordWithMoreThan16Characters(){
        boolean result = loginValidator.isValidPassword("Galatasaray12345!");
        assertFalse(result);
    }

    @Test
    void testPasswordWithEmptyPassword(){
        boolean result = loginValidator.isValidPassword("");
        assertFalse(result);
    }
    @Test
    void testPasswordWithNullPassword(){
        boolean result = loginValidator.isValidPassword(null);
        assertFalse(result);
    }


}
