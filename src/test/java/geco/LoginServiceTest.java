package geco;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {
  String[] listOfNewLogin;
  @Before
  public void setup() {
    listOfNewLogin = new String[3];
  }
  @Test
  public void loginExists() {
    // When
    listOfNewLogin[0] = "Thomas";
    listOfNewLogin[1] = "Thomas";
    listOfNewLogin[2] = "Xavier";
    // Given
    LoginService loginService = new LoginService(listOfNewLogin);
    // Then
    Assert.assertTrue("Thomas not found", loginService.loginExists("Thomas"));
  }

  @Test
  public void addLogin() {
    // When
    listOfNewLogin[0] = "Thomas";
    listOfNewLogin[1] = "Thomas";
    listOfNewLogin[2] = "Xavier";
    // Given
    LoginService loginService = new LoginService(listOfNewLogin);
    loginService.addLogin("Xavier");
    // Then
    Assert.assertTrue("Xavier not found", loginService.loginExists("Xavier"));
  }

  @Test
  public void findAllLoginsStartingWith() {
    // When
    listOfNewLogin[0] = "Thomas";
    listOfNewLogin[1] = "Thom";
    listOfNewLogin[2] = "Xavier";
    // Given
    LoginService loginService = new LoginService(listOfNewLogin);
    ArrayList<String> resultList = new ArrayList<>();
    resultList.add("Thom");
    resultList.add("Thomas");
    // Then
    Assert.assertEquals(resultList, loginService.findAllLoginsStartingWith("Th"));
  }

  @Test
  public void findAllLogins() {
    // When
    listOfNewLogin[0] = "Thomas";
    listOfNewLogin[1] = "Thom";
    listOfNewLogin[2] = "Xavier";
    // Given
    LoginService loginService = new LoginService(listOfNewLogin);
    ArrayList<String> resultList = new ArrayList<>();
    resultList.add("Thom");
    resultList.add("Thomas");
    resultList.add("Xavier");
    // Then
    Assert.assertEquals(resultList, loginService.findAllLogins());
  }
}