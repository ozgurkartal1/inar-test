package week_16_assignment.java;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class LoginValidator {
    private final Pattern emailPattern =
            Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+" +
                    "[a-zA-Z]{2,7}$");

    private final Pattern passwordPattern =
            Pattern.compile("^(?=.*[0-9])(?=.*[!@#$%^&*]).{8,16}$");

    public boolean isValidUserName(String username){
        if(username == null || username.trim().isEmpty()){
            return false;
        }
        return emailPattern.matcher(username).matches();
    }

    public boolean isValidPassword(String password){
        if(password == null || password.trim().isEmpty()){
            return false;
        }

        return passwordPattern.matcher(password).matches();
    }

    
}
