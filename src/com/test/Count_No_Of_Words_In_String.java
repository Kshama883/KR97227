package com.test;

import java.util.HashMap;


public class Count_No_Of_Words_In_String {

	public static void main(String[] args) 
	{
		String str = "This this is is done by Saket Saket";
		HashMap<String,Integer> h = new HashMap<String,Integer>();
		String[] c= str.split(" ");
		int count =1;
		
		for (String d : c) 
		{
			if(h.containsKey(d))
			{
				h.put(d, count+1);
			}
			else
			{
				h.put(d, count);
			}
			
		}
		
		System.out.println(h);
	}

}
