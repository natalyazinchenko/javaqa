import org.junit.Assert;
import org.junit.Test;


public class PointsTest {
    private double DELTA = 1e-15;

    @Test
    public void testDistance(){
        Points a = new Points();
        Assert.assertEquals(30.0, a.distance(20.0,50.0), 0.01);
    }
}
