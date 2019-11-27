package com.test;

import java.util.TreeSet;

public class SecondHighestNoArray {

	public static void main(String[] args) 
	{
		 int arr[] = { 14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
		 TreeSet<Integer> t = new TreeSet<>();
		 for (Integer integer : arr)
		 {
			 t.add(integer);
		 }
		 
		 t = (TreeSet<Integer>) t.descendingSet();
		 System.out.println(t);
		 
		 int i=1;
		 for (Integer integer : t)
		 {
			if(i==2)
			{
				System.out.println("second highest "+integer);
				break;
			}
			i++;
		 }

	}

}
