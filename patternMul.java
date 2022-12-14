package com.pattern;

public class patternMul {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=6-i;j=j+1)
			{
				System.out.print(i*j+"  ");
				
			}
			System.out.println();
		}
		
	}

	}


