package day1.firstprograms;

public class leapyear {

	public static void main(String[] args) {
		int year=2022;
		if ((year%4==0 && year%100!=0) ||(year%400==0))
	       {  System.out.println("Its a leap year");
	       }
	      else
	       {System.out.println("Its not a leap year");

	}

	}
}
