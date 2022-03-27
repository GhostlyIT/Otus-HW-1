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
            result = App.solve(1d, 0d, 1d);
        } catch (CoefficientZeroException e) {
            e.printStackTrace();
        }

        Assert.assertEquals(result, new ArrayList<Double>());
    }

    @Test
    public void testResultWithTwoRoots()
    {
        ArrayList<Double> result = null;
        try {
            result = App.solve(1d, 0d, -1d);
        } catch (CoefficientZeroException e) {
            e.printStackTrace();
        }

        ArrayList<Double> expectedResult = new ArrayList<>();
        expectedResult.add(-1d);
        expectedResult.add(1d);

        Assert.assertEquals(result, expectedResult);
    }

    @Test(expected = CoefficientZeroException.class)
    public void testFirstCoefficientCantBeZero() throws CoefficientZeroException {
        App.solve(0d, 1d, 1d);
    }


}
