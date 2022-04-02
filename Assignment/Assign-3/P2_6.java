class P2_6
{
		public static void main(String args[])
		{
			for(int i=5;i>=1;i--)
			{
				for(int s=1;s<=5-i;s++)
					System.out.print(" ");
				
				for(int j=1;j<=2*i-1;j++)
					System.out.print("*");
			System.out.println();
			}
		}
}


class P2_61
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int space=1;space<=i;space++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=5;j++)
			{
				System.out.print("*");
			}
			for(int k=5;k>i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}