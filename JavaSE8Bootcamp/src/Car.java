
public class Car {

	String color;
	String type;
	int serialNumber;
	static int carCount;
	
	{
		color = "red";
		type = "Celica";
	}
	
	Car() {
		carCount++;
		serialNumber = carCount;
	}

	Car(String c, String t) {
		color = c;
		type = t;
		carCount++;
		serialNumber = carCount;
	}

	void start() {
		System.out.println("Get Started...");
	}

	void printDescription() {
		System.out.println("This is a " + color + " " + type);
	}

	String getDescription() {
		String desc = "This is a " + color + " " + type;
		return desc;
	}
	
	void drive() {
		System.out.println("Engage the 'er gear and drive the car - " + carCount);
	}

	// customize frame: newColor = white newType = convertible
	void customize(String color, String type) {
		this.color = color;
		this.type = type + " " + this.type;
		System.out.println("After customization: " + getDescription());
	}
	public static void setCarCount() {
		carCount = 0;
	}
}
