package cs3354.unitTestDemo.util;

@SuppressWarnings("serial")
public class CalcError extends RuntimeException
{
    public CalcError(String reason) 
    {
        super(reason);
    }
}
