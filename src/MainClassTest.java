import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetClassString() {
        String word = this.getClassString();
        Assert.assertTrue("class string dont have 'hello'", word.contains("Hello") | word.contains("hello"));
    }

}
