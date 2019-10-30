

public class ExtendsExceptionUserDefinedOverDraftException {

	public static void main(String[] args) {
		// banking app - with extended exception
		try {
			withdraw(10000);
		}
		catch(OverDraftException e){
			System.out.println("Customized Exception - within catch block: " + e.getMessage());
		}
		finally {
			System.out.println("with in finally block.");
		}
}
	public static void withdraw(double amount) throws OverDraftException{
		double balance = 5000.00;
		if(balance - amount < 0) {
			throw new OverDraftException("insufficient funds..!");
		}
	}
	
}
