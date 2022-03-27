package sunsetcode.Exceptions;

public class CoefficientZeroException extends Exception
{
    @Override
    public String getMessage() {
        return "Coefficient 'a' can't be zero";
    }
}
