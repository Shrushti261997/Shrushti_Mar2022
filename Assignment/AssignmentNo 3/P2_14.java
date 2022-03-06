class P2_14
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int space=1;space<=i-1;space++)
				System.out.print(" ");
			
			for(int j=i;j<=5;j++)
				System.out.print("*");
			
			for(int k=5;k>i;k--)
				System.out.print("*");
			
			System.out.println();
		}
		
			for(int i=1;i<=5;i++)
		{
			for(int space=1;space<=5-i;space++)
				System.out.print(" ");
			
			for(int j=1;j<=i;j++)
			System.out.print("*");
			
			for(int k=1;k<i;k++)
				System.out.print("*");
			
			System.out.println();
		}
	}
}