class Pattern10
{
	public static void main(String args[])
	{
		char ch=68;
		for(int i=1;i<=5;i++)
		{
			for(int space=1;space<=5-i;space++)
			{
				System.out.print(" " );
			}
			for(int j=1;j<=i;j++)
			{
				ch++;
				System.out.print(ch+ " " );
			}
		ch=(char)(68-i);
		System.out.println();
		}
	}
}