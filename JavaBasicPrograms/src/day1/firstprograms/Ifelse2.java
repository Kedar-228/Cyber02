package day1.firstprograms;

public class Ifelse2 { // if else if nested statement

	public static void main(String[] args){
int English=35;
int marathi =40;
int maths=30;
if((English>=35 && English<100)&&( marathi>=35 && marathi<100)&& (maths>=35 && maths<100))
{	System.out.println("Candidate is passed:");
}

else if(English>=100 || marathi >=100 || maths>=100)
	{System.out.println("Invalid input");
	} 
else
{ System.out.println("candidate is fail");
}
}
}

