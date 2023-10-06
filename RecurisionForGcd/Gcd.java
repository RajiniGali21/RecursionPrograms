package com.kn.RecurisionForGcd;

public class Gcd {

	public int GcdOfNumbers(int a, int b) 
	{
//		if(a!=0)
//		{
//			return GcdOfNumbers(b,a%b);
//		}
//		else
//		{
//			return b;
//		}
		if(b==0)
		{
			return a;
		}
		else
		{
			return GcdOfNumbers(b,a%b);
		}
	}
	}

