package com.test;

public class Swap 
{
	public static void main(String[] args)
	{
		int x=10;
		int y=12;
		System.out.println("Before Swap "+x+" -X "+y+" -Y");
		if(y>x)
		{
			x=y-x;
			y=y-x;
			x=x+y;
			System.out.println(x+" = X "+y+" = Y");
		}
		else
		{
			x=y-x;
			y=y-x;
			x=x+y;
			System.out.println(x+" -X "+y+" -Y");

		}
	}

}
