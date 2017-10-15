package	is.ru.stringcalculator;

public class StringCalculator{
	public static void main(String[] args){

	}

	public int Add(String numbers){
		if(numbers == ""){
			return 0;
		}
		// If numbers is not empty we continue.
		return getSum(numbers);
	}

	private int getSum(String number){
		int sum = 0;
		String errorString = "Negatives not allowed: ";
		boolean throwError = false;

		for(String numb : number.split(",|\\n| ")){
			int tempnumber = Integer.parseInt(numb);
			if(tempnumber < 0){
				errorString += tempnumber;
				throwError = true;
			}
			sum += tempnumber;
		}
		if(throwError){
			throw new IllegalArgumentException(errorString);
		}
		return sum;
	}
}
