package day1.firstprograms;

public class PrimeNumber {

	public static void main(String[] args) {
	int i,num=6;
	for(i=2;i<num;i++)
	{if(num%i==0)
	{break;
	}

	}if(i==num)
	{System.out.println("Its Prime number");
}else
{System.out.println("Its not Prime Number");

}
}
}
