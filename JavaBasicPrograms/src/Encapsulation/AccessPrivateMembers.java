package Encapsulation;

import Encapsulation.PrivateMembers;
public class AccessPrivateMembers {

	public static void main(String[] args) {
		
		PrivateMembers p1=new PrivateMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}// if your try to access one package class to another package then you use import statement
