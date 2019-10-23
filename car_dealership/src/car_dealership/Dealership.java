package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		System.out.println("Sri Ramajeyam...!");
		// Main class for the car dealership system.
		Customer cust1 = new Customer();
		Vehicle vehicle = new Vehicle("Toyoto", "Fortuner", 12000);
		Employee emp = new Employee();
		
		cust1.setName("Sri");
		cust1.setAddress("8, Wireless Station Road, Porur, Chennai.");
		cust1.setCashOnHand(50000);
		cust1.purchaseCar(vehicle, emp, false);
		
		Vehicle car = new Vehicle("BMW", "M3", 20000);
		boolean value= car.equals(vehicle);
		System.out.println("The two cars models are same or what..? ");
		System.out.println(value);
		
	}

}
