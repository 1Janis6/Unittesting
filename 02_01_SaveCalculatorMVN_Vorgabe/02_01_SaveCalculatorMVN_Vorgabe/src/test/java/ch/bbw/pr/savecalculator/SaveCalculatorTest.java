package ch.bbw.pr.savecalculator;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


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
        assertFalse(testee.summe(minus1, minus2) == 20);

    }

    @Test
    public void subtractionEqualsZero() {
        SaveCalculator testee = new SaveCalculator();
        int minus1 = 20;
        int minus2 = 20;
        assertFalse(testee.summe(minus1, minus2) == 0);

    }
}
