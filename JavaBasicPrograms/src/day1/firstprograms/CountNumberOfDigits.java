package day1.firstprograms;

public class CountNumberOfDigits {

	public static void main(String[] args) {
	int count=0,num=562368;
	while(num!=0)
	{num/=10;
	++count;
	}
	System.out.println("Number of Digits :"+ count);
	}

}
