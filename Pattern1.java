package com.pattern;

public class Pattern1 {

	public static void main(String[] args) 
	{
		int c=1;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=9-k;k++)
			{
				System.out.print(c+"*");
				c++;
				
			}
			System.out.println();
		}
		//System.out.println();

	}

}
