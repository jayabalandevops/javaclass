import java.util.Scanner;
public class MonthWhile {

	public static void main(String[] args) {
		System.out.println("Sri Ramajeyam...!");
		Scanner in = new Scanner(System.in);
		String option = new String();
		int month;
		option = "y";
		
		while (option.equals("y")) {
			System.out.println("Enter the number of the month: ");
			month = in.nextInt();
			if (month == 1)
				System.out.println("Month " + month + " is - January.");
			else if (month == 2)
				System.out.println("Month " + month + " is - February.");
			else if (month == 3)
				System.out.println("Month " + month + " is - March.");
			else if (month == 4)
				System.out.println("Month " + month + " is - April.");
			else if (month == 5)
				System.out.println("Month " + month + " is - May.");
			else if (month == 6)
				System.out.println("Month " + month + " is - June.");
			else if (month == 7)
				System.out.println("Month " + month + " is - July.");
			else if (month == 8)
				System.out.println("Month " + month + " is - August.");
			else if (month == 9)
				System.out.println("Month " + month + " is - September.");
			else if (month == 10)
				System.out.println("Month " + month + " is - October.");
			else if (month == 11)
				System.out.println("Month " + month + " is - November.");
			else if (month == 12)
				System.out.println("Month " + month + " is - December.");
			else
				System.out.println("Month " + month + " is - Invalid.");
			
			System.out.println("Enter y to continue: ");
			option = in.next();
			if (option.equals("y"))
					continue;
			else {
				System.out.println("Bye for now..!");
				break;
			}
		}
	}

}
