package geco;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    private LoginService loginService;
    private LoginGenerator loginGenerator;
    private String prenom;
    private String nom;
    private String prenom2;
    private String nom2;
    private String nom3;
    public String PaulDupongLog = "PDUP";
    public String PierreDupardLog = "PDUP1";
    public String JacquesDurantLog = "JDUR";
    private String[] liste = {"JROL",
            "BPER", "CGUR", "JDU", "JRAL", "JRAL1"};

    @Before
    public void setup() {
        prenom = "Paul";
        nom = "Dupond";
        prenom2 = "Pierre";
        nom2 = "Dupard";
        nom3 = "Durant";
        loginService = new LoginService(liste);
        loginGenerator = new LoginGenerator(loginService);
    }

    @Test
    public void generateLoginForNomAndPrenom() {
        // given
        String nomPaul;
        String prenomPaul;
        String retour;
        String retour2;
        // when
        nomPaul = nom3;
        prenomPaul = prenom;
        retour = loginGenerator.generateLoginForNomAndPrenom(nomPaul,prenomPaul);
        retour2 = loginGenerator.generateLoginForNomAndPrenom(nomPaul,prenomPaul);

        // then
        Assert.assertEquals("PDUR", retour);
        Assert.assertEquals("PDUR1", retour2);
    }
}