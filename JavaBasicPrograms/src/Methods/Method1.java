package Methods;

public class Method1 {
	static int salary;
	int empId;	
	void display() {
		System.out.println("I am display()...");
	}
	static void print() {
		System.out.println("I am print()...");
	}
	public static void main(String[] args) {
		//access static members---> static variable and method
		System.out.println("static variable salary: "+Method1.salary);//0
		Method1.print();		
		//access non static members---> non-static variable and method
		Method1 m1=new Method1();
		System.out.println("non-static variable empId: "+m1.empId);//0
		m1.display();		
		//update static member
		Method1.salary=25000;
		System.out.println("update static variable salary: "+Method1.salary);//25000
		//update non-static member
		m1.empId=205;
		System.out.println("update non-static variable empId: "+m1.empId);//205		
		Method1 m2=new Method1();
		System.out.println("2nd instance non-static variable empId: "+m2.empId);//0
		m2.display();
	}
}