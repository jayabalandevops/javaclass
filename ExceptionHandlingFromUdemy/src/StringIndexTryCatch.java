
public class StringIndexTryCatch {

	public static void main(String[] args) {
		// string index out of bound exception
		String str = "Developer to Architect..!";
		System.out.println("Before the string exception - try block");
		try{
			char ch = str.charAt(30);
			System.out.println(ch);
		}
		catch(StringIndexOutOfBoundsException | NullPointerException ex) {
			System.out.println("String index exception or Null Pointer exception: " + ex.getMessage());
		}
//		catch(NullPointerException ex) {
//			System.out.println("Null Pointer exception - " + ex.getMessage());
//		}
		catch(Exception ex) {
			System.out.println("Exception - " + ex.getMessage());
		}
		System.out.println("After try block - after exception.");
	}

}
