package test.calc;

import org.junit.Test;
import dssc.calc.*;

import static org.junit.Assert.*;

public class CalcTest {
    @Test
    public void testAdd() {
        Calc calc = new Calc();
        assertEquals(calc.add(2, 3), 5);
    }

}
