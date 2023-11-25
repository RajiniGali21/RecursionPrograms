package Fibanocci;

public class Fibanoci 
{
int n1=0,n2=1,n3=0;
	public int Fib(int n) 
	{
		if(n>0)
		{
			n3 = n1+n2;
			n1 = n2;
			n2=n3;
			System.out.print(" "+n3);
			Fib(n-1);
		}
		return n3;
	
	}
}

