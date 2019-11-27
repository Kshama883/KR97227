package com.test;

public class Armstrong 
{
	public static void main(String[] args)
	{
		//153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
		
		int n =153,i,c = 0;
		int amrstrong =n;
		while(n>0)
		{
			i=n%10;	
			n= n/10;
			c=c+(i*i*i);
			System.out.println(c);
		}
		
		if(c==amrstrong)
		{
			System.out.println("-------------Armstrong !");
		}
		else
		{
			System.out.println("-----------------No");
		}
		
	}
}
