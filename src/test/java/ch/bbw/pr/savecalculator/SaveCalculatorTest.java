package ch.bbw.pr.savecalculator;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.*;


public class SaveCalculatorTest {


    @Test
    public void shouldAnswerTrue(){
        assertTrue(true);

    }

//    Tests Für Summe
    @Test
    public void summeFalse() {
        SaveCalculator testee = new SaveCalculator();
        int summand1 = 20;
        int summand2 = 30;
        assertFalse(testee.summe(summand1, summand2) == 40);

    }
    @Test
    public void summeIsWorkingCorrectly() {
        SaveCalculator testee = new SaveCalculator();
        int summand1 = 20;
        int summand2 = 30;
        assertTrue(testee.summe(summand1, summand2) == 50);

    }
    @Test
    public void summeWithTwoNegativeNumbers() {
        SaveCalculator testee = new SaveCalculator();
        int summand1 = -20;
        int summand2 = -40;
        assertTrue(testee.summe(summand1, summand2) == -60);

    }

    @Test
    public void summeEqualsZero() {
        SaveCalculator testee = new SaveCalculator();
        int summand1 = 0;
        int summand2 = 0;
        assertTrue(testee.summe(summand1, summand2) == 0);
    }

    @Test
    public void summeWithNegativeNumbers() {
        SaveCalculator testee = new SaveCalculator();
        int summand1 = 0;
        int summand2 = -1;
        assertTrue(testee.summe(summand1, summand2) == -1);
    }

    @Test (expected = ArithmeticException.class)
    public void summeWithMaxValue() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = Integer.MAX_VALUE;
        int value2 = 50;
        assertFalse(testee.summe(value1, value2) != 0);
    }

    @Test
    public void summeWhereResultIsNegative() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = -50;
        int value2 = 30;
        assertFalse(testee.summe(value1, value2) == 0);
    }

    @Test (expected = ArithmeticException.class)
    public void SummeWithMinValue() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = Integer.MIN_VALUE;
        int value2 = -30;
        assertFalse(testee.summe(value1, value2) == 0);
    }

    // Tests für Subtraktion

    @Test
    public void subtractionFalse() {
        SaveCalculator testee = new SaveCalculator();
        int minus1 = 40;
        int minus2 = 30;
        assertFalse(testee.subtraction(minus1, minus2) == 20);

    }

    @Test
    public void subtractionEqualsZero() {
        SaveCalculator testee = new SaveCalculator();
        int minus1 = 20;
        int minus2 = 20;
        assertTrue(testee.subtraction(minus1, minus2) == 0);

    }

    @Test
    public void subtractionWithNegativeNumbers() {
        SaveCalculator testee = new SaveCalculator();
        int minus1 = 0;
        int minus2 = 10;
        assertTrue(testee.subtraction(minus1, minus2) == -10);

    }

    @Test
    public void subtractionWithMinusMinusEqualsPlus() {
        SaveCalculator testee = new SaveCalculator();
        int minus1 = 20;
        int minus2 = -20;
        assertTrue(testee.subtraction(minus1, minus2) == 40);

    }

    @Test (expected = ArithmeticException.class)
    public void subtractionWithMaxValue() {
        SaveCalculator testee = new SaveCalculator();
        int minus1 = Integer.MAX_VALUE;
        int minus2 = -1;
        assertTrue(testee.subtraction(minus1, minus2) != 0);

    }

    @Test (expected = ArithmeticException.class)
    public void subtractionWithMinValue() {
        SaveCalculator testee = new SaveCalculator();
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
        SaveCalculator testee = new SaveCalculator();
        int numerator = 10;
        int denominator = 5;
        assertTrue(testee.division(numerator, denominator) == 2);

    }
    @Test
    public void divisionFalse() {
        SaveCalculator testee = new SaveCalculator();
        int numerator = 10;
        int denominator = 5;
        assertFalse(testee.division(numerator, denominator) == 3);

    }
    @Test
    public void divisionEqualsOne() {
        SaveCalculator testee = new SaveCalculator();
        int numerator = 20;
        int denominator = 20;
        assertTrue(testee.division(numerator, denominator) == 1);
    }
    @Test (expected = ArithmeticException.class)
    public void divisionEqualsZero() {
        SaveCalculator testee = new SaveCalculator();
        int numerator = 10;
        int denominator = 0;
        assertTrue(testee.division(numerator, denominator) == 0);
    }

    @Test (expected = AssertionError.class)
    public void divisionWithMinusMinusEqualsPlus() {
        SaveCalculator testee = new SaveCalculator();
        int numerator = -20;
        int denominator = -10;
        assertTrue(testee.division(numerator, denominator) == 0.5);
    }

    @Test (expected = AssertionError.class)
    public void divisionWithMaxValue() {
        SaveCalculator testee = new SaveCalculator();
        int numerator = Integer.MAX_VALUE;
        double denominator = 0.5;
        double result = numerator / denominator;
        assertEquals(0.5,result,0);
    }
    @Test (expected = AssertionError.class)
    public void divisionWithMinValue() {
        SaveCalculator testee = new SaveCalculator();
        int numerator = Integer.MIN_VALUE;
        int denominator = 5;
        assertEquals(0,testee.division(numerator, denominator),0);
    }
    //Power
    @Test
    public void powerIsWorkingCorrectly() {
        SaveCalculator testee = new SaveCalculator();
        int powerValue = 5;
        assertEquals(25,testee.power(powerValue), 0);
    }

    @Test
    public void powerWithZero() {
        SaveCalculator testee = new SaveCalculator();
        int powerValue = 0;
        assertEquals(0,testee.power(powerValue), 0);
    }

    @Test
    public void powerWithNegativeNumber() {
        SaveCalculator testee = new SaveCalculator();
        int powerValue = -5;
        assertEquals(25,testee.power(powerValue), 0);
    }

    @Test (expected = ArithmeticException.class)
    public void powerWithMaxValue() {
        SaveCalculator testee = new SaveCalculator();
        int powerValue = Integer.MAX_VALUE;
        assertTrue(testee.power(powerValue) != 0);
    }

    @Test (expected = ArithmeticException.class)
    public void powerWithMinValue() {
        SaveCalculator testee = new SaveCalculator();
        int powerValue = Integer.MIN_VALUE;
        assertTrue(testee.power(powerValue) != 0);
    }

}