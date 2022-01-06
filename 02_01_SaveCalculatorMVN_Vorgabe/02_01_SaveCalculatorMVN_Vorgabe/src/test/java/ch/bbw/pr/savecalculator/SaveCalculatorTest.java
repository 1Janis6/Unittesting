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
}
