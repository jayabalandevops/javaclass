
import java.net.*;

public class RuntimeUncheckedVsChecked {

	public static void main(String[] args) {
		// Runtime - unchecked vs checked exception
		openHttpConnection();
	}
	public static void openHttpConnection() {
		try {
			URL site = new URL("http://www.abcdkljlkjlkj.com");
			System.out.println("Within intertech site: " + URL.class);
		}
		catch(MalformedURLException e) {
			System.out.println("Hey - the URL isn't correct..!");
		}
	}

}
