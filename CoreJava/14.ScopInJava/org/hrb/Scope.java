package org.hrb;

// The scope of the variable is defined by the passage of the variable in which it can be used and accessed.
// public, private, protected, and default . These are the scope operators which operate on a variable to decide their existence in various parts of the code.
// 

public class Scope {
	
	/*
	public static void main(String[] args) {
		// i is a local variable which is limited for this method only.
		int i;
		for (i = 1; i < 6; i++) {
			System.out.println(i);
		}
		System.out.println("**********");
		System.out.println(i);
		
		// i1 is the local variable which have scope inside the for loop only.
		for (int i1 = 0; i1 < 6; i1++) {
			System.out.println(i1);
		}
	}*/
	
	// static variable is a class variable , accessible throughout the class.
	static int i = 100;
	 
	public static void main(String[] args) {
		{
			// this i is a local variable which is limited to this scope only.
			int i = 5;
			System.out.println("inside braces :"+i);
		}
		System.out.println("outside braces :"+i);
	}
	
}
