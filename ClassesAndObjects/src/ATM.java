
public class ATM {

	public static void main(String[] args) {
		// main entry for the banking system ATM
		BankAccount account = new BankAccount();
		double amount = 20.00;
		account.printBalance();
		account.withdraw(amount);
		System.out.println("The balance after with drawing amount: " + amount);
		account.printBalance();
	}

}
