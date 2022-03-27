package sunsetcode;

import sunsetcode.Exceptions.CoefficientZeroException;

import java.util.ArrayList;

public class App 
{
    public static double EPSILON = 0.000001d;

    public static ArrayList<Double> solve(double a, double b, double c) throws CoefficientZeroException
    {
        if (compareDoubles(a, 0)) {
            throw new CoefficientZeroException();
        }

        ArrayList<Double> result = new ArrayList<>();
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b - Math.sqrt(discriminant)) / 2 * a;
            double x2 = (-b + Math.sqrt(discriminant)) / 2 * a;
            result.add(x1);
            result.add(x2);
        } else if (compareDoubles(discriminant, 0)) {
            double x = -b / 2 * a;
            result.add(x);
        }

        return result;
    }

    public static boolean compareDoubles(double d1, double d2)
    {
        return Math.abs(d1 - d2) < EPSILON;
    }
}
