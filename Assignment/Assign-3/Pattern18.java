class Pattern18
{
	public static void main(String args[])
	{ char ch=64;
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				ch++;
				System.out.print(ch+ " ");
				
			}
			System.out.println();
			ch=64;
		}
	}
}