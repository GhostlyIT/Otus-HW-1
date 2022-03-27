package sunsetcode;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class AppTest 
{
    @Test
    public void testEmptyResult()
    {
        ArrayList<Double> result = App.solve(1, 0, 1);

        Assert.assertEquals(result, new ArrayList<Double>());
    }
}
