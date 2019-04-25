package cs3354.unitTestDemo.simpleCalc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import cs3354.unitTestDemo.util.CalcError;

public class SimpleCalcTestCase
{
    private SimpleCalc calcUnderTest;
    
    @BeforeClass
    public static void startUp() throws Exception
    {
        System.out.println("SimpleCalc startUp");
    }
    
    @AfterClass
    public static void shutDown() throws Exception
    {
        System.out.println("SimpleCalc shutDown");
    }

    @Before
    public void setUp() throws Exception
    {
        System.out.println("SimpleCalc setUp");
        calcUnderTest = new SimpleCalc();
    }

    @After
    public void tearDown() throws Exception
    {
        System.out.println("SimpleCalc tearDown");
    }

    @Test
    public void testAdd()
    {
        System.out.println("SimpleCalc testAdd");

        double result = calcUnderTest.add(1,1);
        assertEquals(2.0, result, .001);
    }

    @Test
    public void testSub()
    {
        System.out.println("SimpleCalc testSub");

        double result = calcUnderTest.sub(2,1);
        assertEquals(1.0, result, .001);
    }

    @Test
    public void testMul()
    {
        System.out.println("SimpleCalc testMul");

        double result = calcUnderTest.mul(2,1);
        assertEquals(2.0, result, .001);
    }

    @Test
    public void testDiv()
    {
        System.out.println("SimpleCalc testDiv");

        double result = calcUnderTest.div(5,2);
        assertEquals(2.5, result, .001);
    }

    @Test(expected=CalcError.class)
    public void testDivError()
    {
        System.out.println("SimpleCalc testDivError");

        double result = calcUnderTest.div(1, 0);
    }

    
}
