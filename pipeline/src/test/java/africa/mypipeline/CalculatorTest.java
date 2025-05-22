package africa.mypipeline;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase {
    @Test
    public void test_That_Function_add_is_working() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 2);
        assertEquals(4, result);

    }
}