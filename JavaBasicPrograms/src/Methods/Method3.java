package Methods;
//static variable
public class Method3 {
	static int age=25,salary;	
	public static void main(String[] args) {
		System.out.println("Static global Age: "+age);
		int age=10;
		System.out.println("Age: "+age);//10
		System.out.println("Static global variable: "+Method3.age);
		
		display();
	}
	static void display() {
		System.out.println("Salary: "+salary);
		int salary=25000;
		System.out.println("Salary: "+salary);
		System.out.println("Static global Salary: "+Method3.salary);
	}
	
}

/**
this keyword is an instance of current class
this keyword is used to differentiate non-static global variable and local variable when they have same name
this keyword should used only inside nonstatic method*/