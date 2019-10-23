
public class TestCar {

	public static void main(String[] args) {
		// main entry for car classes
		System.out.println("Sri Ramajeyam...!");
		System.out.println(Car.carCount);

		Car car1, car2;
		car1 = new Car("White", "Toyoto - Fortuner");
		car2 = new Car("White", "Ford - Discoverer");
		System.out.println("Car 1 serial number: " + car1.serialNumber);
		car2.drive();
		car2.printDescription();
		Car.setCarCount();
		car2.customize("White", "Convertible");
		Car car3 = new Car();
		System.out.println("Car 3 serial number: " + car3.serialNumber);
		car3.drive();
		System.out.println("Description: " + car3.getDescription());
	

	}

}
