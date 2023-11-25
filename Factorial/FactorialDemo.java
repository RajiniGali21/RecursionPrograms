package Factorial;

import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args)
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number = ");
		int n=sc.nextInt();
		Factorial f1 = new Factorial();
		int res = f1.fact(n);
		System.out.println(res);
		sc.close();
	}

}
