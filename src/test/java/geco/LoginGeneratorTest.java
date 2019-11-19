package geco;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    private LoginService loginService;
    private LoginGenerator loginGenerator;
    private String nom;
    private String prenom;
    private String nom2;
    private String prenom2;
    private String nom3;
    private String prenom3;
    private String nom4;
    public String PaulDupongLog = "PDUP";
    public String PierreDupardLog = "PDUP1";
    public String JacquesDurantLog = "JDUR";
    private String[] liste = {"JROL",
            "BPER", "CGUR", "JDU", "JRAL", "JRAL1"};

    @Before
    public void setup() {
        nom = "Dupond";
        prenom = "Paul";
        nom2 = "Durant";
        prenom2 = "Pierre";
        nom3 = "Rolling";
        prenom3 = "Jean";
        nom4 = "Du";
        loginService = new LoginService(liste);
        loginGenerator = new LoginGenerator(loginService);
    }

    @Test
    public void generateLoginForNomAndPrenom() {
        // given
        String nomPaul;
        String prenomPaul;
        String nomRolling;
        String prenomJean;
        String nomDu;
        String retour;
        String retour2;
        String retour3;
        // when
        nomPaul = nom;
        prenomPaul = prenom;
        nomRolling = nom3;
        prenomJean = prenom3;
        nomDu = nom4;
        retour = loginGenerator.generateLoginForNomAndPrenom(nomPaul,prenomPaul);
        retour2 = loginGenerator.generateLoginForNomAndPrenom(nomRolling,prenomJean);
        retour3 = loginGenerator.generateLoginForNomAndPrenom(nomDu,prenomPaul);

        // then
        Assert.assertEquals("PDUP", retour);
        Assert.assertEquals("JROL2", retour2);
        Assert.assertEquals("PDU", retour3);
    }
}