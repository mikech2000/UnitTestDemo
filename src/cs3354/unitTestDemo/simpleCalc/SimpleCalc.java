package cs3354.unitTestDemo.simpleCalc;

import cs3354.unitTestDemo.util.CalcError;

public class SimpleCalc
{

    public double add(double v1, double v2)
    {
        return v1 + v2;
    }

    public double sub(double v1, double v2)
    {
        return v1 - v2;
    }

    public double mul(double v1, double v2)
    {
        return v1 * v2;
    }

    public double div(double dividend , double divisor )
    {
        if(divisor == 0.0) {
            throw new CalcError("Division by zero");
        }
        
        return dividend / divisor;
    }
}
