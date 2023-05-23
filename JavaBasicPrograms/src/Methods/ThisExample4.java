package Methods;

public class ThisExample4 {
		int age;
		void call() {
			System.out.println("I am call method");
		}
		void m(int age) {
			System.out.println("local age: "+age);//25
			System.out.println("Global age: "+this.age);//0
			//call(); //or
			this.call();//i am calling method
			System.out.println("this keyword value is: "+this);// prints same reference ID
		}
		public static void main(String args[]) {
			ThisExample4 obj = new ThisExample4();
			System.out.println("object obj value is: "+obj);// prints the reference ID
			obj.m(25);
		}
	}