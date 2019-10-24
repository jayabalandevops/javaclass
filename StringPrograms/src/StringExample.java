import java.util.Calendar;
import java.util.Locale;

/*
 * Udemy: Jeff Jenson - java class works
 * written for practicing purpose
 */

public class StringExample {

	public static void main(String[] args) {
		// string example programs
		String s = "Hello World..!   ";
		System.out.println(s);
		String sub = s.substring(4, 10);
		System.out.println(sub);
		String strimmed = s.trim();
		System.out.println(strimmed);
		System.out.println(s.toUpperCase());
		char ch = s.charAt(6);
		System.out.println(ch);

		// Using + operator with the string objects
		String greet = "Hello, ";
		String name = "Dave";

		// assigning string literal to string variable str
		String str = greet + name + "..!";
		System.out.println(str);

		// using assignment operators with string objects and
		// also performs concatenation operation
		str = "My dog";
		str += " is white in color...!";
		System.out.println(str);

		// example for immutable property of a string
		String a = "It is ";
		String b = "a dog ";
		String c = "day afternoon";

		a = a + b + c;
		c = "Wow";

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		// example using immutable strings and concatenation
		// String objects manipulation uses much memory if changes frequently
		// Instead, StringBuilder and StringBuffer reduces to some level
		String message = "Hello, ";
		message += name;
		message += ". Today is ";
		message += Calendar.getInstance().getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);
		message += ".";
		System.out.println(message);
		
		// example using string builder
		StringBuilder sb = new StringBuilder();
		sb.append("Hello, ");
		sb.append(name);
		sb.append(". Today is ");
		sb.append(Calendar.getInstance().getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US));
		System.out.println(sb);
		}

}
