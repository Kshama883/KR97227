package com.test;

//civic, radar, level, rotor, kayak, reviver, racecar

public class Palindrome 
{
	public static void main(String[] args)
	{
		String p = "ciic";
		int count =0;
		
		if(p.length()%2==0)
		{
			int center =p.length()/2; 
			char[] c =p.toCharArray();
			
			for (int i = 0; i < c.length-1; i++) 
			{
				System.out.println(c[i]);
								
				for (int j = (c.length)-1; j>0; j--)
				{
					System.out.println(c[j]+" ");
					
					if(c[i]==c[j])
					{
						System.out.println("equal");
						count++;
					}
				}
			}
			
			if (count==center) 
			{
				System.out.println("Palindrome !!");
			}
			else
			{
				System.out.println("Not !!");
			}
		}
		else
		{
			
		}
	}
}
