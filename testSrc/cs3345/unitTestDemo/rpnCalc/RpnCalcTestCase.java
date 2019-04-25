package cs3345.unitTestDemo.rpnCalc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cs3354.unitTestDemo.util.CalcError;

public class RpnCalcTestCase
{
    private RpnCalc rpnCalc;
    
    @Before
    public void setUp() throws Exception
    {
        rpnCalc = new RpnCalc();
    }

    @After
    public void tearDown() throws Exception
    {
    }

    @Test
    public void testPopResult()
    {
        assertEquals(0, rpnCalc.getStack().size());
        rpnCalc.pushValue(1.0);
        assertEquals(1, rpnCalc.getStack().size());
        double val = rpnCalc.popResult();
        assertEquals(1.0, val, .0001);
        assertTrue(rpnCalc.isEmpty());
    }

    @Test
    public void testPeekResult()
    {
        rpnCalc.pushValue(1.0);
        assertEquals(1, rpnCalc.getStack().size());
        double val = rpnCalc.peekResult();
        assertEquals(1.0, val, .0001);
        assertEquals(1, rpnCalc.getStack().size());
    }

    @Test
    public void testPushValue()
    {
        assertEquals(0, rpnCalc.getStack().size());
        rpnCalc.pushValue(1.0);
        assertEquals(1, rpnCalc.getStack().size());
    }

    @Test
    public void testClear()
    {
        assertEquals(0, rpnCalc.getStack().size());
        rpnCalc.pushValue(1.0);
        rpnCalc.pushValue(1.0);
        rpnCalc.pushValue(1.0);
        assertEquals(3, rpnCalc.getStack().size());
        rpnCalc.clear();
        assertEquals(0, rpnCalc.getStack().size());
    }

    @Test
    public void testAdd()
    {
        int stackSize = rpnCalc.getStack().size();
        rpnCalc.pushValue(1.0);
        rpnCalc.pushValue(1.0);
        rpnCalc.add();
        double val = rpnCalc.popResult();
        assertEquals(2.0, val, .00001);
        assertEquals(stackSize, rpnCalc.getStack().size());
    }

    @Test
    public void testSub()
    {
        int stackSize = rpnCalc.getStack().size();
        rpnCalc.pushValue(1.0);
        rpnCalc.pushValue(3.0);
        rpnCalc.sub();
        double val = rpnCalc.popResult();
        assertEquals(2.0, val, .00001);
        assertEquals(stackSize, rpnCalc.getStack().size());
    }

    @Test
    public void testMul()
    {
        int stackSize = rpnCalc.getStack().size();
        rpnCalc.pushValue(2.5);
        rpnCalc.pushValue(2.0);
        rpnCalc.mul();
        double val = rpnCalc.popResult();
        assertEquals(5.0, val, .00001);
        assertEquals(stackSize, rpnCalc.getStack().size());
    }

    @Test
    public void testDiv()
    {
        int stackSize = rpnCalc.getStack().size();
        rpnCalc.pushValue(5.0);
        rpnCalc.pushValue(2.0);
        rpnCalc.div();
        double val = rpnCalc.popResult();
        assertEquals(2.5, val, .00001);
        assertEquals(stackSize, rpnCalc.getStack().size());
    }

    @Test(expected=CalcError.class)
    public void testDivError()
    {
        rpnCalc.pushValue(5.0);
        rpnCalc.pushValue(0.0);
        rpnCalc.div();
        System.out.println(rpnCalc.popResult());
    }

    @Test(expected=CalcError.class)
    public void testUnderflow()
    {
        rpnCalc.pushValue(1.0);
        rpnCalc.add();
    }

    @Test
    public void testIsEmpty()
    {
        assertTrue(rpnCalc.isEmpty());
        rpnCalc.pushValue(1.0);
        assertFalse(rpnCalc.isEmpty());        
    }

    @Test
    public void testGetStack()
    {
    }

}
