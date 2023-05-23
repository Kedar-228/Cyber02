package day1.firstprograms;

public class nonstatic {
int age;
boolean result;
char name;
double mobno;
float marks;

	public static void main(String[] args) {
		nonstatic ref=new nonstatic();
		System.out.println(ref.age);
		System.out.println(ref.result);
		System.out.println(ref.name);
		System.out.println(ref.mobno);
		System.out.println(ref.marks); 
		System.out.println("********************************");
		 ref.age=10;
		ref.result=true;
		ref.name='k';
		ref.mobno=906786;
		ref.marks=80;
		
		
	System.out.println(ref.age);
	System.out.println(ref.result);
	System.out.println(ref.name);
	System.out.println(ref.mobno);
	System.out.println(ref.marks);
	System.out.println("********************************");
	nonstatic ref1=new nonstatic();
	System.out.println(ref1.age);
	System.out.println(ref1.result);
	System.out.println(ref1.name);
	System.out.println(ref1.mobno);
	System.out.println(ref1.marks); 
	}

}
