
public class ExceptionObject {

	public static void main(String[] args) {
		// Exception objects stacktrace
		try {
			String str = " A char string";
			System.out.println("Before problem");
			char ch = str.charAt(20);
			System.out.println("After Problem");
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Problem in main: " + e.getMessage());
			e.printStackTrace();
		}

	}

}
