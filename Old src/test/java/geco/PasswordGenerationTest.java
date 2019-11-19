package geco;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGenerationTest {

    private PasswordGeneration passwordGeneration;

    @Before
    public void setup() {
        passwordGeneration = new PasswordGeneration();
    }

    @Test
    public void generate() {
        //given
        String password;
        Integer length = 8;
        //when
        password = passwordGeneration.generate();
        //then
        Assert.assertEquals(length.intValue(), password.length());
    }
}