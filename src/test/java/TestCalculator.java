import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.example.Calculator;

public class TestCalculator {
    Calculator calculator;

    @BeforeTest
    public void init() {
        calculator = new Calculator();
    }

    @BeforeMethod
    public void reset() {
        calculator.reset();
    }

    @Test
    public void testPlusCorrectly() {
        calculator.plus(10);
        Assert.assertEquals(10, calculator.getResult());
    }

    @Test
    public void testMinusCorrectly() {
        calculator.plus(10);
        calculator.minus(5);
        Assert.assertEquals(5, calculator.getResult());
    }

    @Test
    public void testMulCorrectly() {
        calculator.plus(10);
        calculator.mul(0);
        Assert.assertEquals(0, calculator.getResult());
    }

    @Test
    public void testDivCorrectly() {
        calculator.plus(100);
        calculator.div(0);
        Assert.assertEquals(0, calculator.getResult());
    }
    @Test
    public void testFail() {
        calculator.plus(100);
        calculator.div(0);
        Assert.assertEquals(10, calculator.getResult());
    }
}

