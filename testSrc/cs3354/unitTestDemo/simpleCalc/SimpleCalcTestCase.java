package cs3354.unitTestDemo.simpleCalc;

import static org.junit.Assert.*;

import org.junit.Test;

import cs3354.unitTestDemo.util.CalcError;

public class SimpleCalcTestCase
{
    @Test
    public void testAdd()
    {
        System.out.println("SimpleCalc testAdd");

        SimpleCalc calcUnderTest = new SimpleCalc();
        double result = calcUnderTest.add(1, 1);
        assertEquals(2.0, result, .001);

        System.out.println("SimpleCalc testAdd Finished\n");
    }

    @Test
    public void testSub()
    {
        System.out.println("SimpleCalc testSub");

        SimpleCalc calcUnderTest = new SimpleCalc();
        double result = calcUnderTest.sub(2, 1);
        assertEquals(1.0, result, .001);

        System.out.println("SimpleCalc testSub Finished\n");
    }

    @Test
    public void testMul()
    {
        System.out.println("SimpleCalc testMul");

        SimpleCalc calcUnderTest = new SimpleCalc();
        double result = calcUnderTest.mul(2, 1);
        assertEquals(2.0, result, .001);

        System.out.println("SimpleCalc testMul Finished\n");
    }

    @Test
    public void testDiv()
    {
        System.out.println("SimpleCalc testDiv");

        SimpleCalc calcUnderTest = new SimpleCalc();
        double result = calcUnderTest.div(5, 2);
        assertEquals(2.5, result, .001);

        System.out.println("SimpleCalc testDiv Finished\n");
    }

    @Test(expected = CalcError.class)
    public void testDivError()
    {
        System.out.println("SimpleCalc testDivError");

        SimpleCalc calcUnderTest = new SimpleCalc();
        double result = calcUnderTest.div(1, 0);

        // This should not be printed b/c the exception is thrown above
        System.out.println("SimpleCalc testDivError Finished\n"); 
    }

}
