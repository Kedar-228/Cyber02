package Constructors;

public class Cons8  
	{
		int age;
		double salary;
		Cons8() {
			System.out.println("**********User Defined Zero-Param Constructor, start from here****************");
			age=25;
			salary=32506.56;
			System.out.println("**********User Defined Zero-Param Constructor, ends here****************");
		}
		public static void main(String[] args)
		{
			Cons8 ref1 = new Cons8();
			System.out.println(ref1.age);// 
			System.out.println(ref1.salary);//
			ref1.age=55;
			System.out.println("Updated age with ref1: "+ref1.age);// 
			System.out.println("***********************");
			Cons8 ref2 = new Cons8();
			System.out.println(ref2.age);// 
			System.out.println(ref2.salary);//
		}
	}

	/**
	as we learn, constructor is used to initialize non-static members of the class hence here we can 
	see age variable value is getting initialize by constructor
	*/