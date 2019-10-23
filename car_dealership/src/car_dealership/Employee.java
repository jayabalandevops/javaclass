package car_dealership;

public class Employee {

	
	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		if(finance==true) {
			double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
			runCreditHistory(cust, loanAmount);
		}
		else if(vehicle.getPrice() <= cust.getCashOnHand())
			processTransaction(cust, vehicle);
		else
			System.out.println("Please bring some more money." + vehicle );		
	}
	public void runCreditHistory(Customer cust, double loanAmount){
		System.out.println("Ran credit history...");
		System.out.println("The customer is approved to purchase car");
	}
	public void processTransaction(Customer cust, Vehicle vehicle){
		System.out.println("The customer purchased a car. " + vehicle + "for the price " + vehicle.getPrice());
	}
}
