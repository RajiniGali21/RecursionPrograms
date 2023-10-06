package com.kn.RecurisionForGcd;

import java.util.Scanner;

public class GcdDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers = ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Gcd gcd = new Gcd();
		int res = gcd.GcdOfNumbers(a,b);
		System.out.println(" GCD of given numbers = "+res);
		sc.close();
	}

}
