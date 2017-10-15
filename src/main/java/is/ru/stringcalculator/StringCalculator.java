package	is.ru.stringcalculator;

public class StringCalculator{
	public static void main(String[] args){

	}

	public int Add(String numbers){
		if(numbers == ""){
			return 0;
		}
		// If numbers is not empty we continue.
		String[] splittedNumbers = numbers.split(",");
		int sum = 0;
		for(String numb : splittedNumbers){
			sum += Integer.parseInt(numb);
		}

		return sum;
	}
}
