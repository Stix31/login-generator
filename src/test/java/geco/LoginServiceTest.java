package geco;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {

    public LoginService loginServire;
    public String PaulDupongLog = "PDUP";
    public String PierreDupardLog = "PDUP1";
    public String JacquesDurantLog = "JDUR";


    public String[] liste = {PaulDupongLog, JacquesDurantLog};
    public String[] listeMemeLogin = {PaulDupongLog, PierreDupardLog};
    @Before
    public void setup() {
        loginServire = new LoginService(liste);
    }

    @Test
    public void loginExists() {
        //given
        String PaDuLog;
        //When
        PaDuLog = PaulDupongLog;
        //Then
        Assert.assertTrue(loginServire.loginExists(PaDuLog));
    }

    @Test
    public void addLogin() {
        //given
        String piDuLog;
        //When
        piDuLog = PierreDupardLog;
        loginServire.addLogin(piDuLog);
        //Then
        Assert.assertTrue(loginServire.loginExists(piDuLog));
    }

    @Test
    public void findAllLoginsStartingWith() {
        //given
        String startLogin;
        String paDuLog;
        String piDuLog;
        //When
        startLogin = "PDU";
        paDuLog = PaulDupongLog;
        piDuLog = PierreDupardLog;
        String[] liste = listeMemeLogin;
        loginServire.addLogin(piDuLog);
        List<String> retour = loginServire.findAllLoginsStartingWith(startLogin);
        //Then
        Assert.assertTrue(retour.contains(paDuLog));
        Assert.assertTrue(retour.contains(piDuLog));
    }

    @Test
    public void findAllLogins() {
        //given
        String paDuLog;
        String piDuLog;
        //When
        paDuLog = PaulDupongLog;
        piDuLog = PierreDupardLog;
        loginServire.addLogin(piDuLog);
        List<String> retour = loginServire.findAllLogins();
        //Then
        Assert.assertTrue(retour.contains(paDuLog));
        Assert.assertTrue(retour.contains(piDuLog));
    }
}