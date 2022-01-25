package ch.bbw.pr.savecalculator;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.*;


public class SaveCalculatorTest {

    private SaveCalculator testee;
    @Before
    public void setUp() {
        testee = new SaveCalculator();
    }


    @Test
    public void shouldAnswerTrue(){
        assertTrue(true);

    }

    //Tests Für Summe
    @Test
    public void summeFalse() {
        int summand1 = 20;
        int summand2 = 30;
        assertFalse(testee.summe(summand1, summand2) == 40);

    }
    @Test
    public void summeIsWorkingCorrectly() {
        int summand1 = 20;
        int summand2 = 30;
        assertTrue(testee.summe(summand1, summand2) == 50);

    }
    @Test
    public void summeWithTwoNegativeNumbers() {
        int summand1 = -20;
        int summand2 = -40;
        assertTrue(testee.summe(summand1, summand2) == -60);

    }

    @Test
    public void summeEqualsZero() {
        int summand1 = 0;
        int summand2 = 0;
        assertTrue(testee.summe(summand1, summand2) == 0);
    }

    @Test
    public void summeWithNegativeNumbers() {
        int summand1 = 0;
        int summand2 = -1;
        assertTrue(testee.summe(summand1, summand2) == -1);
    }

    @Test (expected = ArithmeticException.class)
    public void summeWithMaxValue() {
        int value1 = Integer.MAX_VALUE;
        int value2 = 50;
        assertFalse(testee.summe(value1, value2) != 0);
    }

    @Test
    public void summeWhereResultIsNegative() {
        int value1 = -50;
        int value2 = 30;
        assertFalse(testee.summe(value1, value2) == 0);
    }

    @Test (expected = ArithmeticException.class)
    public void SummeWithMinValue() {
        int value1 = Integer.MIN_VALUE;
        int value2 = -30;
        assertFalse(testee.summe(value1, value2) == 0);
    }

    // Tests für Subtraktion

    @Test
    public void subtractionFalse() {
        int minus1 = 40;
        int minus2 = 30;
        assertFalse(testee.subtraction(minus1, minus2) == 20);

    }

    @Test
    public void subtractionIsWorkingCorrectly() {
        int minus1 = 40;
        int minus2 = 30;
        assertTrue(testee.subtraction(minus1, minus2) == 10);

    }

    @Test
    public void subtractionEqualsZero() {
        int minus1 = 20;
        int minus2 = 20;
        assertTrue(testee.subtraction(minus1, minus2) == 0);

    }

    @Test
    public void subtractionWithNegativeNumbers() {
        int minus1 = 0;
        int minus2 = 10;
        assertTrue(testee.subtraction(minus1, minus2) == -10);

    }

    @Test
    public void subtractionWithMinusMinusEqualsPlus() {
        int minus1 = 20;
        int minus2 = -20;
        assertTrue(testee.subtraction(minus1, minus2) == 40);

    }
    @Test
    public void subtractionWithTwoNegativeNumbers() {
        int minus1 = -20;
        int minus2 = -20;
        assertTrue(testee.subtraction(minus1, minus2) == 0);

    }

    @Test (expected = ArithmeticException.class)
    public void subtractionWithMaxValue() {
        int minus1 = Integer.MAX_VALUE;
        int minus2 = -1;
        assertTrue(testee.subtraction(minus1, minus2) != 0);

    }

    @Test (expected = ArithmeticException.class)
    public void subtractionWithMinValue() {
        int minus1 = Integer.MIN_VALUE;
        int minus2 = 1;
        assertTrue(testee.subtraction(minus1, minus2) != 0);

    }
    // Tests für Multipliktion
    @Test
    public void multiplicationFalse() throws NoSuchMethodException, SecurityException, InvocationTargetException, IllegalAccessException {
        SaveCalculator SaveCalculator = new SaveCalculator();
        Method method = SaveCalculator.class.getDeclaredMethod("multiplication", Integer.class, Integer.class);
        method.setAccessible(true);

        int factor1 = 30;
        int factor2 = 10;

        double result = (double) method.invoke(SaveCalculator, factor1, factor2);
        assertFalse(result == 400);

    }
    @Test
    public void multiplicationIsWorkingCorrectly() throws NoSuchMethodException, SecurityException, InvocationTargetException, IllegalAccessException {
        SaveCalculator SaveCalculator = new SaveCalculator();
        Method method = SaveCalculator.class.getDeclaredMethod("multiplication", Integer.class, Integer.class);
        method.setAccessible(true);

        int factor1 = 5;
        int factor2 = 5;

        double result = (double) method.invoke(SaveCalculator, factor1, factor2);
        assertTrue(result == 25);

    }

    @Test
    public void multiplicationWithTwoNegativeNumbers() throws NoSuchMethodException, SecurityException, InvocationTargetException, IllegalAccessException {
        SaveCalculator SaveCalculator = new SaveCalculator();
        Method method = SaveCalculator.class.getDeclaredMethod("multiplication", Integer.class, Integer.class);
        method.setAccessible(true);

        int factor1 = -5;
        int factor2 = -5;

        double result = (double) method.invoke(SaveCalculator, factor1, factor2);
        assertTrue(result == 25);
    }

    @Test
    public void multiplicationEqualsZero() throws NoSuchMethodException, SecurityException, InvocationTargetException, IllegalAccessException {
        SaveCalculator SaveCalculator = new SaveCalculator();
        Method method = SaveCalculator.class.getDeclaredMethod("multiplication", Integer.class, Integer.class);
        method.setAccessible(true);

        int factor1 = 0;
        int factor2 = 10;

        double result = (double) method.invoke(SaveCalculator, factor1, factor2);
        assertTrue(result == 0);

    }
    @Test
    public void multiplicationWithNegativeNumbers() throws NoSuchMethodException, SecurityException, InvocationTargetException, IllegalAccessException {
        SaveCalculator SaveCalculator = new SaveCalculator();
        Method method = SaveCalculator.class.getDeclaredMethod("multiplication", Integer.class, Integer.class);
        method.setAccessible(true);

        int factor1 = -10;
        int factor2 = 10;

        double result = (double) method.invoke(SaveCalculator, factor1, factor2);
        assertTrue(result == -100);

    }
    @Test
    public void multiplicationWithMinusMinusEqualsPlus() throws NoSuchMethodException, SecurityException, InvocationTargetException, IllegalAccessException {
        SaveCalculator SaveCalculator = new SaveCalculator();
        Method method = SaveCalculator.class.getDeclaredMethod("multiplication", Integer.class, Integer.class);
        method.setAccessible(true);

        int factor1 = -20;
        int factor2 = -20;

        double result = (double) method.invoke(SaveCalculator, factor1, factor2);
        assertTrue(result == 400);

    }

    @Test (expected = InvocationTargetException.class)
    public void multiplicationWithMaxValue() throws NoSuchMethodException, SecurityException, InvocationTargetException, IllegalAccessException {
        SaveCalculator SaveCalculator = new SaveCalculator();
        Method method = SaveCalculator.class.getDeclaredMethod("multiplication", Integer.class, Integer.class);
        method.setAccessible(true);

        int factor1 = Integer.MAX_VALUE;
        int factor2 = 20;

        double result = (double) method.invoke(SaveCalculator, factor1, factor2);
        assertFalse(result != 0);
    }

    @Test (expected = InvocationTargetException.class)
    public void multiplicationWithMinValue() throws NoSuchMethodException, SecurityException, InvocationTargetException, IllegalAccessException {
        SaveCalculator SaveCalculator = new SaveCalculator();
        Method method = SaveCalculator.class.getDeclaredMethod("multiplication", Integer.class, Integer.class);
        method.setAccessible(true);

        int factor1 = Integer.MIN_VALUE;
        int factor2 = -20;

        double result = (double) method.invoke(SaveCalculator, factor1, factor2);
        assertFalse(result == 0);
    }

    // Tests für Division
    @Test
    public void divisionIsWorkingCorrectly() {
        int numerator = 10;
        int denominator = 5;
        assertTrue(testee.division(numerator, denominator) == 2);

    }
    @Test
    public void divisionFalse() {
        int numerator = 10;
        int denominator = 5;
        assertFalse(testee.division(numerator, denominator) == 3);

    }
    @Test
    public void divisionEqualsOne() {
        int numerator = 20;
        int denominator = 20;
        assertTrue(testee.division(numerator, denominator) == 1);
    }
    @Test (expected = ArithmeticException.class)
    public void divisionEqualsZero() {
        int numerator = 10;
        int denominator = 0;
        assertTrue(testee.division(numerator, denominator) == 0);
    }

    @Test (expected = AssertionError.class)
    public void divisionWithMinusMinusEqualsPlus() {
        int numerator = -20;
        int denominator = -10;
        assertTrue(testee.division(numerator, denominator) == 0.5);
    }

    @Test (expected = AssertionError.class)
    public void divisionWithMaxValue() {
        int numerator = Integer.MAX_VALUE;
        double denominator = 0.5;
        double result = numerator / denominator;
        assertEquals(0.5,result,0);
    }
    @Test (expected = AssertionError.class)
    public void divisionWithMinValue() {
        int numerator = Integer.MIN_VALUE;
        int denominator = 5;
        assertEquals(0,testee.division(numerator, denominator),0);
    }
    //Power
    @Test
    public void powerIsWorkingCorrectly() {
        int powerValue = 5;
        assertEquals(25,testee.power(powerValue), 0);
    }

    @Test
    public void powerWithZero() {
        int powerValue = 0;
        assertEquals(0,testee.power(powerValue), 0);
    }

    @Test
    public void powerWithNegativeNumber() {
        int powerValue = -5;
        assertEquals(25,testee.power(powerValue), 0);
    }

    @Test (expected = ArithmeticException.class)
    public void powerWithMaxValue() {
        int powerValue = Integer.MAX_VALUE;
        assertTrue(testee.power(powerValue) != 0);
    }

    @Test (expected = ArithmeticException.class)
    public void powerWithMinValue() {
        int powerValue = Integer.MIN_VALUE;
        assertTrue(testee.power(powerValue) != 0);
    }

}