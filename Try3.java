package com.pattern;

public class Try3 
{

	public static void main(String[] args) 
	{
		int size=5;
		for(int i=0;i<=size;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=size;j>i;j--)
			{
			System.out.print("*");
		}
		System.out.println();
	}

}
}