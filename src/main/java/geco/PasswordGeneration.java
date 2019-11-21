package geco;

import java.nio.charset.Charset;
import java.util.Random;

public class PasswordGeneration {

  public String getRandomPassword() {
    byte[] array = new byte[8]; // length is bounded by 8
    new Random().nextBytes(array);
    return new String(array, Charset.forName("UTF-8"));
  }
}
