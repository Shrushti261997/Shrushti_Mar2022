class P2_7
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
			for(int s=1;s<=5-i;s++)
			System.out.print(" ");
		
			for(int j=1;j<=2*i-1;j++)
			System.out.print("*");
		System.out.println();
		}
		
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