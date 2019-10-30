import java.net.*;

public class ThrowsExample {

	public static void main(String[] args) {
		// throws example
		try {
			openHttpConnection("http://intertech.com");
		}
		catch(MalformedURLException e) {
			System.out.println("Hey - the URL isn't correct");
		}
	}
public static void openHttpConnection(String url) throws MalformedURLException{
	URL site = new URL(url);
	System.out.println("With in http connection throws block.");
	// do some work with this site
}

}
