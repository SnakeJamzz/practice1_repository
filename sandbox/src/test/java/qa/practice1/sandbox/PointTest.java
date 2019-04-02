package qa.practice1.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;


public class PointTest {
    Point pa = new Point (0.0,0.0);
    Point pb = new Point (1.0,1.0);

    @Test
    public void testDistance(){
        Assert.assertEquals (pa.distance(pb), 1.4142135623730951);
    }
}
