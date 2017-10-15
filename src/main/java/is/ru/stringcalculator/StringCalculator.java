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

		String delimiterRegex = ",|\\n| ";

		System.out.println("Number before: " + number );


		if(number.charAt(0) == '/' && number.charAt(1) == '/'){
			delimiterRegex = number.substring(2, number.indexOf("\n"));
			int wordLength = number.length();
			number = number.substring(number.indexOf("\n") + 1, wordLength);
		}


		System.out.println("deliReg: " + delimiterRegex );
		System.out.println("Number: " + number );


		for(String numb : number.split(delimiterRegex)){
			int tempnumber = Integer.parseInt(numb);
			// If we have a negative value
			if(tempnumber < 0){
				// If we have been here before we add a comma before our number
				if(throwError){
					errorString += ",";
				}
				errorString += tempnumber;
				throwError = true;
			}
			else if(tempnumber <= 1000){ // Numbers bigger than 1000 are ignored
				sum += tempnumber;
			}
		}
		if(throwError){
			throwIllegalArgumentExc(errorString);
		}

		System.out.println("Sum: " + sum);
		return sum;
	}

	private void throwIllegalArgumentExc(String errormsg){
		throw new IllegalArgumentException(errormsg);
	}
}
