
public class MyDate {
	// Member/instance variables (a.k.a. fields/properties/attributes)
	int month;
	int day;
	int year;
	 
	// Constructors:  
	//   1. Same name as the class  
	//   2. No return type
	
	// The No-argument constructor
	public MyDate() {
		//no argument constructor
	}	
	
	// Constructor that takes 3 arguments
	public MyDate(int month, int day, int year) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
	}

	@Override
	public String toString() {
		return month +"/"+day+"/"+year;
	}

	public void setDate(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
}
