package	is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringCalculatorTest{

	@Test
	public void addOneNumber(){
		StringCalculator calc = new StringCalculator();
		assertEquals(-1, calc.Add(""));
	}
}