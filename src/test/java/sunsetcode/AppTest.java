package sunsetcode;

import org.junit.Assert;
import org.junit.Test;
import sunsetcode.Exceptions.CoefficientZeroException;
import java.util.ArrayList;

public class AppTest 
{
    @Test
    public void testEmptyResult()
    {
        ArrayList<Double> result = null;
        try {
            result = App.solve(1, 0, 1);
        } catch (CoefficientZeroException e) {
            e.printStackTrace();
        }

        Assert.assertEquals(result, new ArrayList<Double>());
    }

    @Test
    public void testResultWithTwoRootsTimesToOne()
    {
        try {
            ArrayList<Double> result = App.solve(1, 0, -1);
            for (Double root : result) {
                Assert.assertEquals(0, root % 1, App.EPSILON);
            }
        } catch (CoefficientZeroException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testResultWithRootsTimesToTwo()
    {
        ArrayList<Double> expectedResult = new ArrayList<>();
        expectedResult.add(-1d);

        try {
            ArrayList<Double> result = App.solve(1, 2, 1);
            Assert.assertEquals(expectedResult, result);
        } catch (CoefficientZeroException e) {
            e.printStackTrace();
        }
    }

    @Test(expected = CoefficientZeroException.class)
    public void testFirstCoefficientCantBeZero() throws CoefficientZeroException {
        App.solve(0, 1, 1);
    }


}
