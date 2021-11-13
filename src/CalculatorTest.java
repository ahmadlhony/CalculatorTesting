


import junit.framework.Assert;
import org.junit.Test;


public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        double a = 15; double b = 20;
        double expectedResult = 35;


        double result = calculator.add(a, b);

        Assert.assertEquals(expectedResult, result);
    }


    @Test
    public void testSubtract() {
        double a = 25; double b = 20;
        double expectedResult = 5;
        double result = calculator.subtract(a, b);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testMultiply() {
        double a = 10; double b = 25;
        double expectedResult = 250;
        double result = calculator.multiply(a, b);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testDivide() {
        double a = 56; double b = 10;
        double expectedResult = 5.6;
        double result = calculator.divide(a, b);
        Assert.assertEquals(expectedResult, result,0.00005);
    }


}