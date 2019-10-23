
public class Earth {

	public static void main(String[] args) {
		// Universe main method - entry point
		Human vikram = new Human("Vikram Kumar", 15, 66, "Blue");
		vikram.speak();
		
		System.out.println();
		
		Human tina = new Human("Tina Singh", 20, 72, "Black");
		tina.speak();
		
		Animal animal1 = new Animal(12, "M", 23);
		animal1.eat();
		
		Bird bird1 = new Bird(3, "F", 5);
		bird1.sleep();
		bird1.eat();
		Sparrow sparrow1 = new Sparrow(1,"M", 1);
		sparrow1.fly();
		Chicken chick1 = new Chicken(2, "F", 5);
		chick1.fly();
		
	}

}
