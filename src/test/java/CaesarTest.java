import org.junit.*;
import static org.junit.Assert.*;
public class CaesarTest {

    @Test
    public void encrypt() {
        //text
    }
    @Test
        public void encrypt1() {
            String plainText= "";
            int shift=0;
        if (shift > 26){
            shift = shift%26;
        }
        else if(shift<0){
            shift = (shift%26) + 26;
        }
        }


}
