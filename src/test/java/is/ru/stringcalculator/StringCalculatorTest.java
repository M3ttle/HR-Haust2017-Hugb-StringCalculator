package	is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringCalculatorTest{

	@Test
	public void addEmptyString(){
		StringCalculator calc = new StringCalculator();
		assertEquals(0, calc.Add(""));
	}

	@Test
	public void addNumberOne(){
		StringCalculator calc = new StringCalculator();
		assertEquals(3, calc.Add("1"));
	}
	@Test
	public void addNumberTwo(){
		StringCalculator calc = new StringCalculator();
		assertEquals(4, calc.Add("2"));
	}
}