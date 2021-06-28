package com.cognixia.basic;

import java.util.Scanner;

public class BasicProgram {
	
	// type main -> Ctrl + Space Bar -> Enter -> autofill the main method
	public static void main(String[] args) {
		
		// single line comment 
		// another single line comment
		
		/*
		multi-line
		comment
		is written
		*/
		
		
		// print to console
		
		// syso -> Ctrl + Space Bar 
		System.out.println("Hello1"); // create a new line after
		
		// sout -> Ctrl + Space Bar
		System.out.println("Hello2");
		
		// println -> a new line after
		// print -> won't create a new line after
		System.out.print("Hello3");
		System.out.print("Hello4");
		
		// \n -> a new line
		System.out.println("\n\n\nHello5");
		
		
		///////////////
		// VARIABLES //
		///////////////
		
		
		// Text
		
		// store multiple characters
		String str = "Hello World";
		System.out.println("str = " + str);
		
		// store one character
		char c = 'a';
		System.out.println("c = " + c);
		
		
		// Number
		
		// int -> whole number
		int i = 5;
		System.out.println("i = " + i);
		
		int calc = 2 * i;
		System.out.println("2 * i = " + calc);
		
		// double -> decimal values
		double dub = 3.14;
		System.out.println("dub = " + dub);
		
		dub = 3.15;
		System.out.println("dub = " + dub);
		
		
		
		// boolean -> true or false
		
		boolean b = true;
		System.out.println("b = " + b);
		
		
		
		// CONSTANTS
		
		// regular variables allow us to change their value
		dub = 2.3;
		
		final double FINAL_VAR = 3.14;
		
		System.out.println("FINAL_VAR = " + FINAL_VAR);
		
		// can't change the value once its set
		//FINAL_VAR = 1.1;
		
		
		// ORDER OF OPERATIONS
		
		// multiplication/division first, then add/substract
		System.out.println(3 + 4 * 5);
		System.out.println( (3 + 4) * 5 );
		
		// printing a calculation with strings (text)
		System.out.println("final answer: " + 4 * 2);
		System.out.println("final answer: " + 4 + 2);
		System.out.println("final answer: " + (4 + 2) );
		
		
		// Scanner -> allow us to take inputs from a user
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("\nEnter your name:");
		String name = sc.nextLine();
		System.out.println("Hello " + name);
		
		System.out.println("\nEnter a number:");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Number: " + num);
		
		System.out.println("Enter a decimal number:");
		double num2 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Number: " + num2);
		
		
		// close Scanner once you're done using it
		sc.close();
		
		
		double myNum = 5.1;
		
		int otherNum = (int) myNum;
		
		System.out.println("otherNum = " + otherNum);
		
		
	}

}










