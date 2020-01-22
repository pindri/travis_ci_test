package test.calc;

import dssc.calc.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalcTest {
    @Test
    public void testAdd() {
        Calc calc = new Calc();
        assertEquals(calc.add(2, 3), 5);
    }

}
