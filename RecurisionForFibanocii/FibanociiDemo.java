package com.kn.RecurisionForFibanocii;

import java.util.Scanner;

public class FibanociiDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number = ");
		int n = sc.nextInt();
		Fibanocii fib = new Fibanocii();
		int res = fib.Fibanoci1(n);
		System.out.println("fibanocii series of given num = "+res);
		sc.close();
		
	}

}
