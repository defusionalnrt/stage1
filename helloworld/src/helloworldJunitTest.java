import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class helloworldJunitTest {
    @Test
    public void test_get() {
        System.out.println("testing function getHelloWorldString()");
        assertEquals("Hello World Test With Junit!", helloworld.getHelloWorldString());
    }
}