package com.pattern;

public class Pattern 
{
	public void paternA(int row)
	{
		for(int i=1;i<=row;i++)
		{
			for(int sp=1;sp<=row-i;sp++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
	
	public void paternB(int row)
	{
		for(int i=1;i<=5;i++)
		{
			for(int sp=1;sp<=row-i;sp++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			
			}
			System.out.println();
		}
	}
	
	public void paternC(int row)
	{
		for(int i=5;i>=1;i--)
		{
			for(int sp=1;sp<=row-i;sp++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			
			}
			System.out.println();
		}
	}
	
	public void paternD(int row)
	{
		for(int i=1;i<=5;i++)
		{
			for(int sp=1;sp<=row-i;sp++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			
			}
			System.out.println();
		
		}
		for(int i=row-1;i>=1;i--)
		{
			for(int sp=1;sp<=row-i;sp++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			
			}
			System.out.println();
		}
	}
	public void paternE(int row)
	{
		for(int i=row;i>=1;i--)
		{
			for(int sp=1;sp<=row-i;sp++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void paternF(int row)
	{
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=row-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	public void paternG(int row)
	{
		for(int i=1;i<=row;i++)
		{
			for(int sp=1;sp<=row-i;sp++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int i=row-1;i>=1;i--)
		{
			for(int sp=1;sp<=row-i;sp++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}
	public void paternH(int row)
	{
		for(int i=1;i<=row;i++)
		{
			for(int sp=1;sp<=row-i;sp++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=row-1;i>=1;i--)
		{
			for(int sp=1;sp<=row-i;sp++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
		
	

	public static void main(String[] args)
	{
		Pattern obj=new Pattern();
		obj.paternA(5);
		obj.paternB(5);
		obj.paternC(5);
		obj.paternD(5);
		obj.paternE(5);
		obj.paternF(5);
		obj.paternG(5);
		obj.paternH(5);
		
	}
}
	
	
	


