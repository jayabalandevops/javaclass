
public class Chicken extends Bird implements Flyable {

	public Chicken(int age, String gender, int weightInlbs) {
		super(age, gender, weightInlbs);
	}
	public void fly() {
		System.out.println("Chiken is Flapping the wings...");
	}
}
