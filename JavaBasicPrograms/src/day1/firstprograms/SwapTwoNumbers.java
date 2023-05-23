package day1.firstprograms;

public class SwapTwoNumbers {

	public static void main(String[] args) {
float first=1.20f, second=2.45f;
System.out.println("Before Swap ");
System.out.println("First Number= "+first);
System.out.println("Second Number "+ second);
 // value of first is assigned to temporary
float temporary=first;
// Value of second is assigned to first 
first =second;
// Value of temporary ( Which contains the initail value of first )is assigned to second
second = temporary;
System.out.println(" After Swap ");
System.out.println("First Number :"+first);
System.out.println("Second Number :"+ second);




	}

}
