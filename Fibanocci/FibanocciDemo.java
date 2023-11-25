package Fibanocci;

import java.util.Scanner;

public class FibanocciDemo 
{
public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number = ");
		int n = sc.nextInt();
		Fibanoci f = new Fibanoci();
		int result = f.Fib(n);
		System.out.print(result+" ");
		sc.close();
	}

}
