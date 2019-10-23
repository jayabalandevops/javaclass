
public class Human {
	public String name;
	public int age;
	public int heightInInches;
	public String eyeColor;
	
	public Human(String name, int age, int heightInInches, String eyeColor) {
		super();
		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
		this.eyeColor = eyeColor;
	}

	public void speak() {
		System.out.println("Hellow my name is " + name);
		System.out.println("I am  "+ heightInInches + " inches tall.");
		System.out.println("I am " + age + " years old.");
		System.out.println("My eye color is " + eyeColor);
	}
	
	public void eat() {
		System.out.println("Eating...");
	}
	
	public void work() {
		System.out.println("Working...");
	}
}
