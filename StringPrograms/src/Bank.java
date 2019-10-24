/*
 * Udemy: Jeff Jensen java examples for practice
 * pass by value: primitives
 * 
 */

public class Bank {

	public static void main(String[] args) {
		// main entry of the Bank System
		Account myAcct = new Account();
		double proposedLoan = 250.00;
		String customerName = "Jason Shapiro";
		
		// Passing by Value: primitives
		proposedLoan = discountLoan(proposedLoan);
		System.out.println(proposedLoan);
		
		// Pass by value: object - is a reference
		debitFee(myAcct);
		System.out.println(myAcct.balance);
		
		// Pass by value: primitives - 
		// since string is immutable - 
		// aname is being changed, the member of the method will allocate, space separately in the heap
		// hence the original aname remains unchanged
		salutation(customerName);
		System.out.println(customerName);
	}

		public static double discountLoan(double x) {
			x = x * 0.95; // 237.50
			return x;
		}
		
		public static void debitFee(Account acct) {
			acct.balance = acct.balance - 2.50; // 97.50
		}
		
		public static void salutation(String aName) {
			aName = "Dear " + aName; // Dear Jason Shapiro
		}
}
