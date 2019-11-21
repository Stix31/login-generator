package geco;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginGeneratorTest {
  private LoginService loginService;
  @Before
  public void setup () {
    loginService = new LoginService(new String[] {"JROL",
        "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
  }
  @Test
  public void generateLoginForNomAndPrenom() {
    // When
    LoginGenerator loginGenerator = new LoginGenerator(loginService);
    // Given
    String nom = "Dupond";
    String prenom = "Paul";
    String nom1 = "Ralling";
    String prenom1 = "John";
    String nom2 = "Rolling";
    String prenom2 = "Jean";
    String nom3 = "Dùrand";
    String prenom3 = "Paul";
    String nom4 = "Du";
    String prenom4 = "Paul";
    // Then
    Assert.assertEquals("PDUP", loginGenerator.generateLoginForNomAndPrenom(nom, prenom));
    Assert.assertEquals("JRAL2", loginGenerator.generateLoginForNomAndPrenom(nom1, prenom1));
    Assert.assertEquals("JROL1", loginGenerator.generateLoginForNomAndPrenom(nom2, prenom2));
    Assert.assertEquals("PDUR", loginGenerator.generateLoginForNomAndPrenom(nom3, prenom3));
    Assert.assertEquals("PDU", loginGenerator.generateLoginForNomAndPrenom(nom4, prenom4));
  }
}