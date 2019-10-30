
public class GFG {

	public static void main(String[] args) {
		// customized exception handling
		int[] arr = new int[4];
		try {
				int i = arr[4];
		}
		catch(Exception cex) {
			System.out.println("Customized Exception - " + cex.getMessage());
		}
		finally {
			System.out.println("Hi, I want to execute..!");
		}
	}

}
