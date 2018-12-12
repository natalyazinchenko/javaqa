import org.junit.Assert;
import org.junit.Test;


public class PointsTest {
    private double DELTA = 1e-15;
@Test
    public void testDistance(){
        Points a = new Points();
   Assert.assertEquals(20.0, a.distance(20.0,40.0), 0.001);

    }
}
