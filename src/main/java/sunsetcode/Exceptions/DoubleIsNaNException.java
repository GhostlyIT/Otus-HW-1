package sunsetcode.Exceptions;

public class DoubleIsNaNException extends Exception
{
    @Override
    public String getMessage() {
        return "Double is actually NaN";
    }
}
