package com.java_Day3_LearningBasicsOfJava;

public class Operators_In_Java {
	
	//Arithmetic Operators
	// +   -   /   *    % (modulus-- this is the remainder)    ++    --
	//Assignment Operators
	//Comparison Operators
	//Logical Operators
	//Bitwise Operators

	public static void main(String[] args) {
		

		int i= 10;
		int j= 5;

		System.out.println(i % j);
	
	// ++ is known as increment (increase by 1) operator	
		
	int a=1;
			a++; 
	System.out.println(a);
	
	//  -- is known as decrement (decrease by 1) operator
	
	int b = 1;
	b--;
	System.out.println(b);
	
	//Assignment Operators
	// =  +=  -=  *=  /=  %=  &=  
	
	int c = 1;  // the assignment is =  you assigned 1 to C
	
	
	//Comparison Operators  (output will be true or false)
	//  >   <   ==  >=   <=  != (not equal)
	
	int d= 20;
	int e= 20;
	int f= 21;
	
	System.out.println (d == e);  //output true
	System.out.println(e == f); //output false
	System.out.println(c < e);  // false
	System.out.println(d != e); //false
	System.out.println(d <= e);  // True
	
	
	// Logical Operators
	System.out.println(d== e && f!=e && d>e);
	System.out.println(d== e && d>e);
	
	
		
	}

}
