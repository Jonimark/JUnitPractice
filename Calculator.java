import java.util.Scanner;

public class Calculator {

    public static int sumCalc (int firstVal, int secondVal) {
		return firstVal + secondVal;
    }
	
	public static int subCalc (int firstVal, int secondVal) {
		return firstVal - secondVal;
    }
	
    public static int mulCalc (int firstVal, int secondVal) {
		return firstVal * secondVal;
    }
	
	public static int divCalc (int firstVal, int secondVal) {
		return firstVal / secondVal;
    }

    public static void main (String[] args) {
		int firstValue;
		int secondValue;
		String calculationMethod;
		Scanner reader = new Scanner(System.in);
		System.out.println ("Insert first value: ");
		firstValue = reader.nextInt();
		System.out.println ("You entered: " + firstValue);
		System.out.println ("Insert second value: ");
		secondValue = reader.nextInt();
		System.out.println ("You entered: " + secondValue);
		System.out.println ("Insert '+', '-', '*' or '/' to calculate your values: ");
		calculationMethod = reader.next();
		System.out.println ("Calculation method is: " + calculationMethod);
		int result = 0;
		if(calculationMethod.equals("+")) {
			result = sumCalc(firstValue, secondValue);
		} else if (calculationMethod.equals("-")) {
			result = subCalc(firstValue, secondValue);
		} else if (calculationMethod.equals("*")) {
			result = mulCalc(firstValue, secondValue);
		} else if (calculationMethod.equals("/")) {
			result = divCalc(firstValue, secondValue);
		}
		System.out.println ("Result is: " + result);
    }
}