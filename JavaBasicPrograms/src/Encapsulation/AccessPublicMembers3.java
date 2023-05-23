package Encapsulation;
import Encapsulation.PublicMembers;
public class AccessPublicMembers3 {

	public static void main(String[] args) {
		//using fully qualified class name: packagename.classname
		Encapsulation.PublicMembers p1=new Encapsulation.PublicMembers();
		System.out.println("Accessing Default members from another class outside package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
		
		Encapsulation.PublicMembers p2=new Encapsulation.PublicMembers();
		
	}
}