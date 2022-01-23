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
	public int subtraction(int minus1, int minus2) throws ArithmeticException
	{
		long value = (long) minus1 - (long) minus2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)){
			throw new ArithmeticException();
		}
		return minus1 - minus2;
	}

	//Multiplikation
	private double multiplication(Integer factor1, Integer factor2) {
		long value = (long) factor1 * (long) factor2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)){
			throw new ArithmeticException();
		}
		return factor1 * factor2;
	}
	//Division
	public double division(int numerator, int denominator) {
		long value = (long) numerator / (long) denominator;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)){
			throw new ArithmeticException();
		}
		return numerator / denominator;
	}
	//Power
	public int power(int powerValue) throws ArithmeticException
	{
		long value = (long) powerValue * (long) powerValue;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)){
			throw new ArithmeticException();
		}
		return powerValue * powerValue;
	}


	//pow
	//sqrt
	//...
}
