package test.calc;

import main.calc.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {
    @Test
    public void testAdd() {
        Calc calc = new Calc();
        assertEquals(calc.add(2, 3), 5);
    }

}
