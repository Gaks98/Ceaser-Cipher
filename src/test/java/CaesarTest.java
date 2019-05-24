import org.junit.*;
import static org.junit.Assert.*;

public class CaesarTest {

@Test
public void Caesar_instatiatesCorrectly_true() {
    Caesar testCaesar = new Caesar("name",1);
    assertTrue(testCaesar instanceof Caesar);
}
@Test
public void encrypt_returnsString_String() {
    Caesar testCaesar = new Caesar("name",1);
    assertEquals("obnf", Caesar.encrypt(testCaesar));
}
@Test
public void decrypt_returnsString_name () {
     Caesar testCaesar = new Caesar("obnf",1);
    assertEquals("name",Caesar.decrypt(testCaesar));
}





}

