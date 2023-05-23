package day1.firstprograms;

public class ifelse {  // NESTED STATEMENT

	public static void main(String[] args) {
	int age=16;
	int weight=50;
	char grp='A';
	if(age>=18)
	{ 
	   if(weight>=50)
	   { 
		    if(grp=='A')
		    {
		    	System.out.println("YOU ARE ELIGIBAL TO DONATE BLOOD :");
	   } 
	   else
	   {System.out.println("YOU ARE NOT ABLE TO DONATE BLOOD BECAUSE BLOOD GROUP IS NOT MATCHING");
	   }
	   }
	   else
	   {System.out.println("YOU ARE NOT ABLE TO DONATE BLOOD BECAUSE waight NOT MATCHING");
	   }
	}
	   else
	   {System.out.println("YOU ARE NOT ELIGIBAL TO DONATE BLOOD BECAUSE YOUR AGE IS BELOW 18 :");
	}

}
	}
