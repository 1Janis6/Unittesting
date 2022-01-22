package ch.bbw.pr.savecalculator;

/**
 * SaveCalculator
 * Rechnet 'vorsichtig' mit Zahlen.
 * Warnt, wenn etwas nicht geht.
 *   
 * @author Peter Rutschmann
 * @version 0.0.1
 */
// Addition
public class SaveCalculator {
	public int summe(int summand1, int summand2) throws ArithmeticException
	{
		long value = (long) summand1 + (long) summand2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)){
			throw new ArithmeticException();
		}
		return summand1 + summand2;
	}
//Subtraktion
	public int subtraktion(int minus1, int minus2) throws ArithmeticException
	{
		long value = (long) minus1 - (long) minus2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)){
			throw new ArithmeticException();
		}
		return minus1 - minus2;
	}

	//Noch un-safe Methoden, die müssen noch angepasst werden.

	public double division(int value1, int value2) {
		return value1 / value2;
	}
	private double multiplication(Integer value1, Integer value2) {
		return value1 * value2;
	}
	//pow
	//sqrt
	//...
}
