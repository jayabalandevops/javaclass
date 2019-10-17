import java.util.Scanner;

public class CalculatorForLoop {

	public static void main(String[] args) {
		System.out.println("Sri Ramajeyam..!");
		Scanner in = new Scanner(System.in);
		int x, y;
		String operator = new String();
		String option = new String();
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the Operation to be performed: +, -, /, *, % : ");
			operator = in.next();
			System.out.println("Enter first integer: ");
			x = in.nextInt();
			System.out.println("Enter second integer: ");
			y = in.nextInt();

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
			System.out.println("Type yes/y to continue: ");
			option = in.next();
			if ((option.equals("yes") || option.equals("y")) && (i < 5)) 
				continue;
			else {
				System.out.println("Bye for now...!");
				break;
			}
		}
	}
}
