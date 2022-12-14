package com.pattern;

public class patternAlpha {

	public static void main(String[] args) 
	{
		for(int i=4;i>=0;i--)
		{
			int al=65;
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(al+j)+" ");
			}
			System.out.println();
		}
		
	}

}
