package com.kn.RecurisionForFibanocii;

public class Fibanocii 
{

	public int Fibanoci1(int n)
	{
		if(n==0)
		{
			return 0;
		}
		if(n==1||n==2)
		{
			return 1;
		}
		
		return  Fibanoci1(n-1)+Fibanoci1(n-2);
		
	}

}
