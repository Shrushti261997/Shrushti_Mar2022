class Pattern8
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i--)
		{
			for(int space=i-1;space>=1;space--)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=5-i;j++)
			{
				System.out.print((i+j)+ " ");
			}
			System.out.println();
		}
	}
}