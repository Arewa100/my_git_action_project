package pipeline.project;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CalculatorTest {
    @Test
    public void testThatCalculatorCanAdd() {
        Calculator newCalculator = new Calculator();
        assertThat(newCalculator.add(2, 3), is(5));
    }
}