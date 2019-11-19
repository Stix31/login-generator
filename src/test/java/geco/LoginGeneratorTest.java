package geco;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {
  LoginGenerator loginGenerator;
  LoginService loginService;
  @Before
  public void setup () {
    loginService = new LoginService(new String[] {"JROL",
        "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
  }
  @Test
  public void generateLoginForNomAndPrenom() {
    // When
    loginGenerator = new LoginGenerator(loginService);
    // Given
    String nom = "Durant";
    String prenom = "Paul";
    // Then
    Assert.assertEquals("PDUR", loginGenerator.generateLoginForNomAndPrenom("Durant", "Paul"));
  }
}