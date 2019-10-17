
import java.util.Scanner;
public class MonthNestedIfElse {

	public static void main(String[] args) {
		System.out.println("This is to read the integer value to identify the month.");
		System.out.println("Enter the month between 1 - 12");
		
		Scanner in = new Scanner(System.in);
		int month = in.nextInt();
		if(month==1)
			System.out.println("Month " + month + " is - January.");
		else if(month==2)
			System.out.println("Month " + month + " is - February.");
		else if(month==3)
			System.out.println("Month " + month + " is - March.");
		else if(month==4)
			System.out.println("Month " + month + " is - April.");
		else if(month==5)
			System.out.println("Month " + month + " is - May.");
		else if(month==6)
			System.out.println("Month " + month + " is - June.");
		else if(month==7)
			System.out.println("Month " + month + " is - July.");
		else if(month==8)
			System.out.println("Month " + month + " is - August.");
		else if(month==9)
			System.out.println("Month " + month + " is - September.");
		else if(month==10)
			System.out.println("Month " + month + " is - October.");
		else if(month==11)
			System.out.println("Month " + month + " is - November.");
		else if(month==12)
			System.out.println("Month " + month + " is - December.");
		else 
			System.out.println("Month " + month + " is - Invalid.");
	}

}
