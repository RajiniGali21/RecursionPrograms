package com.kn.recursive1;

import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args) 
	{
//		Take the input from end user
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number = ");
		int n = sc.nextInt();
//		create an object
		Factorial fact = new Factorial();
//		create a method
		int res = fact.factorial(n);
//		print the output result
		System.out.println("Factorial of given number is = "+res);
//		release resources
		sc.close();
		
	}

}
