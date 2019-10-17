import java.util.Scanner;
public class CalculatorSwitchCase {

	public static void main(String[] args) {
		System.out.println("Sri Ramajeyam...!");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Operation to be performed: +, -, /, *, % : ");
		String operator = in.next();
		System.out.println("Enter first integer: ");
		int x = in.nextInt();
		System.out.println("Enter second integer: ");
		int y = in.nextInt();
		
		switch (operator) {
		case "+":
			System.out.println("Adding: x+y= " + (x + y));
			break;
		case "-":
			System.out.println("Subtracting: x-y= " + (x - y));
			break;
		case "*":
			System.out.println("Multiplying: x*y=" + (x * y));
			break;
		case "/":
			System.out.println("Dividing: x/y=" + (x / y));
			break;
		case "%":
			System.out.println("Remainder: x%y= " + (x % y));
			break;
		default:
			System.out.println("Invalid input. Bye..!");
			break;
		}
	}

}
