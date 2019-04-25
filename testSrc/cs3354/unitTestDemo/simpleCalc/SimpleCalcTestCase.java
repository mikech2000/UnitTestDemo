package cs3354.unitTestDemo.simpleCalc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cs3354.unitTestDemo.util.CalcError;

public class SimpleCalcTestCase
{
    private SimpleCalc calcUnderTest;
    
    @Before
    public void setUp() throws Exception
    {
        calcUnderTest = new SimpleCalc();
    }

    @After
    public void tearDown() throws Exception
    {
    }

    @Test
    public void testAdd()
    {
        double result = calcUnderTest.add(1,1);
        assertEquals(2.0, result, .001);
    }

    @Test
    public void testSub()
    {
        double result = calcUnderTest.sub(2,1);
        assertEquals(1.0, result, .001);
    }

    @Test
    public void testMul()
    {
        double result = calcUnderTest.mul(2,1);
        assertEquals(2.0, result, .001);
    }

    @Test
    public void testDiv()
    {
        double result = calcUnderTest.div(5,2);
        assertEquals(2.5, result, .001);
    }

    @Test(expected=CalcError.class)
    public void testDivError()
    {
        double result = calcUnderTest.div(1, 0);
    }

    
}
