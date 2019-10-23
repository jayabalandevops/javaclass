
public class BankAccount {
	double balance = 150.00;

	public void withdraw(double amount) {
		balance = balance - amount;
	}

	public void printBalance() {
		System.out.println("The balance is: " + balance);
	}
}
