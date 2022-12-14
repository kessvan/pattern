package com.pattern;

public class Patternpro {

	static void k() 
	{
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{
				if(j==0||(i==2&&j==1)||(i==1&&j==2)||(i==0&&j==3)||(i==0&&j==4)||(i==3&&j==2)||(i==4&&j==3)||(i==4&&j==4))
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" ");

				}
			}
			System.out.println();
		}
		System.out.println("-------------");

	}
	
	
	static void E() 
	{
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{
				if(i==0||j==0||i==2||i==4)
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print("");

				}
				
			}
			System.out.println();
		}
		System.out.println("-------------");
		
	}
	static void S() 
	{
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{
				if(i==0||i==2||i==4||(i==1&&j==0)||(i==3&&j==4))
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-------------");
	}
	static void A() 
	{
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{
				if(i==0||j==0||i==2||j==4)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				
				}
			}
			System.out.println();
		}
		System.out.println("-------------");
	}
	static void V() 
	{
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=8;j++)
			{
				if(i==j || i+j==8)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("-------------");

	}
	//System.out.println("-----");
	static void D() 
	{
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{
				if(i==0||j==0||i==2||j==4)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				
				}
			}
			System.out.println();
		}
		System.out.println("-------------");
	}
	static void N() 
	{
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{
				if(j==0||i==j||j==4)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				
				}
			}
			System.out.println();
		}
	}

			public static void main(String[] args) 
			{
				Patternpro.k();
				Patternpro.E();
				Patternpro.S();
				Patternpro.A();
				Patternpro.V();
				Patternpro.D();
				Patternpro.N();
			
			}

}
