package	is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringCalculatorTest{

	// Test an empty string
	@Test
	public void addEmptyString(){
		StringCalculator calc = new StringCalculator();
		assertEquals(0, calc.Add(""));
	}

	// Test out two differect one number values
	@Test
	public void addNumberOne(){
		StringCalculator calc = new StringCalculator();
		assertEquals(1, calc.Add("1"));
	}
	@Test
	public void addNumberTwo(){
		StringCalculator calc = new StringCalculator();
		assertEquals(2, calc.Add("2"));
	}

	// Test two numbers
	@Test
	public void addTwoNumbers1(){
		StringCalculator calc = new StringCalculator();
		assertEquals(11, calc.Add("9,2"));
	}
	@Test
	public void addTwoNumbers2(){
		StringCalculator calc = new StringCalculator();
		assertEquals(11, calc.Add("5,6"));
	}

	//Test three numbers
	@Test
	public void addThreeNumbers1(){
		StringCalculator calc = new StringCalculator();
		assertEquals(6, calc.Add("1,2,3"));
	}
	@Test
	public void addThreeNumbers2(){
		StringCalculator calc = new StringCalculator();
		assertEquals(8, calc.Add("5,1,2"));
	}

	// Testing new Lines
	@Test
	public void addThreeNumbersNewLine1(){
		StringCalculator calc = new StringCalculator();
		assertEquals(6, calc.Add("1\n2,3"));
	}
	@Test
	public void addThreeNumbersNewLine2(){
		StringCalculator calc = new StringCalculator();
		assertEquals(10, calc.Add("5\n1\n4"));
	}

	// Testing space beetween values
	@Test
	public void addThreeNumbersSpace1(){
		StringCalculator calc = new StringCalculator();
		assertEquals(7, calc.Add("1 2 4"));
	}
	@Test
	public void addThreeNumbersSpace2(){
		StringCalculator calc = new StringCalculator();
		assertEquals(12, calc.Add("5\n1 4,2"));
	}

	@Test
	public void testNegativeOneNumber(){
		  try
		  {
		  	StringCalculator calc = new StringCalculator();
		  	calc.Add("-5");
		  }
		  catch(final IllegalArgumentException e)
		  {
		    assertEquals("Negatives not allowed: -5", e.getMessage());
		  }
	}
	@Test
	public void testNegativeTwoNumbers(){
		  try
		  {
		  	StringCalculator calc = new StringCalculator();
		  	calc.Add("-1,2");
		  }
		  catch(final IllegalArgumentException e)
		  {
		    assertEquals("Negatives not allowed: -1", e.getMessage());
		  }
	}

	@Test
	public void testNegativeTwoNegaNumbers(){
		  try
		  {
		  	StringCalculator calc = new StringCalculator();
		  	calc.Add("2 -4 3 -5");
		  }
		  catch(final IllegalArgumentException e)
		  {
		    assertEquals("Negatives not allowed: -4,-5", e.getMessage());
		  }
	}
}