package ifexample;

public class LeapYear {
	public static void main(String[] args) {
		int year = 1992;
		if(year % 4 == 0) 
			System.out.println("Leap Year!!!");
		else if(year % 100 ==0)
			System.out.println("Leap year!!!");
		else if(year % 400 ==0)
			System.out.println("Leap Year!!!");
		else
			System.out.println("Not a Leap Year:(  ");
			
	}
}
