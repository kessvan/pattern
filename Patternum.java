package com.pattern;

public class Patternum {

	public static void main(String[] args)
	{
		int co=1;
		for(int i=5;i>=0;i--)
		{
			for(int j=1;j<=i;j=j+1)
			{
				System.out.print(co+"  ");
				co++;
			}
			System.out.println();
		}
		
	}

}
