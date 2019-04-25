package cs3345.unitTestDemo.rpnCalc;

import java.util.EmptyStackException;
import java.util.Stack;

import cs3354.unitTestDemo.util.CalcError;

public class RpnCalc
{
    private Stack<Double> stack = new Stack<Double>();;
    
    public double popResult()
    {
        return stack.pop();
    }

    public double peekResult()
    {
        try {
            return stack.peek();
        }
        catch(EmptyStackException ex) {
            throw new CalcError("Empty Stack");
        }
    }
    
    public double pushValue(double value)
    {
        return stack.push(value);
    }
    
    public void clear()
    {
        stack.clear();
    }
    
    public void add()
    {
        if(stack.size() < 2) {
            throw new CalcError("Stack Contains Less Than Two Value");            
        }
        
        double val1 = stack.pop();
        double val2 = stack.pop();
        double result = val1 + val2;
        stack.push(result);
    }
    
    public void sub()
    {
        if(stack.size() < 2) {
            throw new CalcError("Stack Contains Less Than Two Value");            
        }
        
        double val1 = stack.pop();
        double val2 = stack.pop();
        double result = val1 - val2;
        stack.push(result);
    }

    public void mul()
    {
        if(stack.size() < 2) {
            throw new CalcError("Stack Contains Less Than Two Value");            
        }
        
        double val1 = stack.pop();
        double val2 = stack.pop();
        double result = val1 * val2;
        stack.push(result);
    }

    public void div()
    {
        if(stack.size() < 2) {
            throw new CalcError("Stack Contains Less Than Two Value");            
        }
        
        double divisor = stack.pop(); 
        if(divisor == 0.0) {
            throw new CalcError("Division by zero");
        }
        
        double dividend = stack.pop(); 
        
        double result = dividend / divisor;
        
        stack.push(result);
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }
    
    // A package public method provided internal testing purposes
    Stack<Double> getStack()
    {
        return stack;
    }
}
