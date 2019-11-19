package geco;

import org.apache.commons.lang3.RandomStringUtils;

import java.security.SecureRandom;

public class PasswordGeneration {

    public String generate () {
        char[] possibleCharacters = (new String("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?")).toCharArray();
        String pwd = RandomStringUtils.random( 8, 0, possibleCharacters.length-1, false, false, possibleCharacters, new SecureRandom() );
        return pwd;
    }
}
