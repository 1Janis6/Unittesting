package ch.bbw.pr.savecalculator;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class SaveCalculatorTest {

    @Test
    public void shouldAnswerTrue(){
        assertTrue(true);

    }

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
    @Test
    public void summeWithMaxValue() {
        SaveCalculator testee = new SaveCalculator();
        int summand1 = Integer.MAX_VALUE;
        int summand2 = 1;
        assertFalse(testee.summe(summand1, summand2) == 1);
    }
}
