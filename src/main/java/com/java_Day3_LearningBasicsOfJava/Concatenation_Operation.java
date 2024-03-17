package com.java_Day3_LearningBasicsOfJava;

public class Concatenation_Operation {

	public static void main(String[] args) {
		//  the symbol of concatenation is +
		//concatenation is known as joining
		
		int a1 = 10;
		int a2 = 20;
		String S1 = "Hello World";
		String S2 = "Learning Java";
		
		System.out.println(a1 + a2 + S1 + S2);  //30 Hello World Learning Java - numbers get added  words get joined
		
		System.out.println(S1+ S2+ a1 + a2);  //HelloWorldLearningJava1020 //will not add numbers here because it is at the end
		

	}

}
