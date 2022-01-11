import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetClassNumber(){
        int a = this.getClassNumber();
        Assert.assertTrue("class_number <= 45",a > 45);
    }

}
