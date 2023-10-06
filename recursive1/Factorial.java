package com.kn.recursive1;

public class Factorial {
// method to call the factorial of given number
	public int factorial(int n) 
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
		return n*factorial(n-1);
		}
	}

}
