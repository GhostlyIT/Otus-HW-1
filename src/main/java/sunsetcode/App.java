package sunsetcode;

import sunsetcode.Exceptions.CoefficientZeroException;

import java.util.ArrayList;

public class App 
{
    public static ArrayList<Double> solve(Double a, Double b, Double c) throws CoefficientZeroException {

        if (a.equals(0.d)) {
            throw new CoefficientZeroException();
        }

        ArrayList<Double> result = new ArrayList<>();
        Double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b - Math.sqrt(discriminant)) / 2 * a;
            double x2 = (-b + Math.sqrt(discriminant)) / 2 * a;
            result.add(x1);
            result.add(x2);
        } else if (discriminant.equals(0d)) {
            double x = -b / 2 * a;
            result.add(x);
        }

        return result;
    }
}
