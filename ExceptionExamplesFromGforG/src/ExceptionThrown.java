
public class ExceptionThrown {
	
	static int divideByZero(int a, int b) {
		int i = a/b;
		return i;
	}

	static int computeDivision(int a, int b) {
		int result = 0;
		try {
			result = divideByZero(a,b);
		}
		catch(NumberFormatException ex) {
			System.out.println("Number Format Exception is occured" + ex.getMessage());
		}
		return result;
	}
	public static void main(String[] args) {
		// Exception Thrown
		int a = 1;
		int b = 0;
		try {
			int i = computeDivision(a,b);
		}
		catch(ArithmeticException aex) {
			System.out.println("Arithmetic Exception - " + aex.getMessage());
		}
	}

}
