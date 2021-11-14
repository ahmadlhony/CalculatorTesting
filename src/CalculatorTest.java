


import junit.framework.Assert;
import org.junit.Test;


public class CalculatorTest {
    Calculator calculator = new Calculator();


    @Test
    public void clear() {

        calculator.clear();
        String textAreaValue =calculator.textAreaValue();
        // is it empty?
        Assert.assertTrue(textAreaValue.isEmpty());
    }
    @Test
    public void testAdd() {
        double a = 15; double b = 20;
        double expectedResult = 35;
        calculator.setValue1(a);
        calculator.setValue2(b);
        calculator.setOperator(1);
        calculator.result();
        double actualResult = Double.parseDouble(calculator.textAreaValue());
        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testSubtract() {
        double a = 25; double b = 20;
        double expectedResult = 5;
        calculator.setValue1(a);
        calculator.setValue2(b);
        calculator.setOperator(2);
        calculator.result();
        double actualResult = Double.parseDouble(calculator.textAreaValue());
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiply() {
        double a = 10; double b = 25;
        double expectedResult = 250;
        calculator.setValue1(a);
        calculator.setValue2(b);
        calculator.setOperator(3);
        calculator.result();
        double actualResult = Double.parseDouble(calculator.textAreaValue());
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDivide() {
        double a = 56; double b = 10;
        double expectedResult = 5.6;
        calculator.setValue1(a);
        calculator.setValue2(b);
        calculator.setOperator(4);
        calculator.result();
        double actualResult = Double.parseDouble(calculator.textAreaValue());
        Assert.assertEquals(expectedResult, actualResult);
    }
}