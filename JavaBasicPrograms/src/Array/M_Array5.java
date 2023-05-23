package Array;

import java.util.Arrays;

class M_Array5{
	static int age=25;
	
	public static void main(String[] args) {
		
		// declaring a source array
		char[] orgArray = { 'a', 'b','e', 'c', 'd'};
		//duplicate array
		char[] cloneArray= { 'a', 'b', 'c', 'd','e'};
		display();
		System.out.println(Arrays.equals(orgArray, cloneArray));
		display();
		Arrays.sort(cloneArray);
		System.out.println(Arrays.equals(orgArray, cloneArray));
		System.out.println(age);
		Arrays.sort(orgArray);
		System.out.println(Arrays.equals(orgArray, cloneArray));
	}
	static void display() {
		System.out.println("Hello");
	}
}
/*
 * F5 --> to go inside the method/function
 * F6 --> next line
 * F8 --> continure the flow
 * ctrl+shft+i
 */