class P2_5
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int s=1;s<=5-i;s++)
			System.out.print(" ");
		
			for(int j=1;j<=2*i-1;j++)
			System.out.print("*");
		System.out.println();
		}
		
	}
}



class P2_51
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int space=1;space<=5-i;space++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int k=1;k<i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
		