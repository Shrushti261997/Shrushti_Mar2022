class Pyramid5
{
	public static void main(String args[])
	{
		int i,j,space,n=8,k=9;
		for(i=1;i<=9;i++)
		{
			for(space=1;space<=9-i;space++)
				System.out.print("   ");
			
			for(j=1;j<=i*2-1;j++)
			{
			 n++;
			     if(j>i)
					{
						k--;
							System.out.print(k+ "  ");
					}
				else
					{
						System.out.print(n + "  ");
					}
	}
	k=9;
	n=8-i;
	System.out.println();
}
}
}