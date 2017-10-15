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

	// Helper functions
	private int getSum(String number){
		int sum = 0;
		String errorString = "Negatives not allowed: ";
		boolean throwError = false; // Boolean value if we have an error, used so we can loop through all numbers before exception is thrown
		String delimiterRegex = ",|\\n| "; // Default delimiter regex

		if(chosenDelimiter(number)){
			delimiterRegex = getDelimiter(number);
			number = cutStringFromNewLine(number);
		}

		for(String numb : number.split(delimiterRegex)){
			int workingNumber = Integer.parseInt(numb);
			// If we have a negative value
			if(workingNumber < 0){
				// If we have been here before we add a comma before our number
				if(throwError){
					errorString += ",";
				}
				errorString += workingNumber;
				throwError = true;
			}
			else if(workingNumber <= 1000){ // Numbers bigger than 1000 are ignored
				sum += workingNumber;
			}
		}
		if(throwError){
			throwIllegalArgumentExc(errorString);
		}
		//Return our sum
		return sum;
	}

	private void throwIllegalArgumentExc(String errormsg){
		throw new IllegalArgumentException(errormsg);
	}
	// If our first characters are // we have a special case for delimiter
	private boolean chosenDelimiter(String number){
		return (number.charAt(0) == '/' && number.charAt(1) == '/');
	}
	// Set our delimiterRegex to the correct delimter, stard from index 2 and stop at newLine
	private String getDelimiter(String number){
		return number.substring(2, number.indexOf("\n"));
	}
	// Remove the first line from the number, so we end up with our numbers and delimiter
	private String cutStringFromNewLine(String number){
		return number.substring(number.indexOf("\n") + 1, number.length());
	}
}
