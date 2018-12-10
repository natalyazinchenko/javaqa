import org.testng.Assert;
import org.testng.annotations.Test;

public class RectangleTests {
    @Test
    public void testRect(){
        Rectangle rrr = new Rectangle(5,5);
        Assert.assertEquals(rrr.areasq(), 25);
    }
}
