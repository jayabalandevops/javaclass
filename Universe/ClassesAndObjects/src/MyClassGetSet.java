
public class MyClassGetSet {

	public static void main(String[] args) {
		PersonGetSet myObj = new PersonGetSet();
//		myObj.name = "John"; // error
//		System.out.println(myObj.name); // error
		myObj.setName("Sri");
		System.out.println("My name is: " + myObj.getName());
		
		
	}
}