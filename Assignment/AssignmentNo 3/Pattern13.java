class Pattern13
{
	public static void main(String args[])
	{
		char ch='A';
		for(int i=1;i<=5;i++)
		{
			for(int space=1;space<=4-i;space++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+ " " );
				
			}
			System.out.println();
			ch++;
		}
	}
}