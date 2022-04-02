class HFP
{
	public static void main(String args[])
	{
		for(int i=1;i<=6;i++)
		{
			//for(int s=6;s>=i;s--)
			//System.out.print(" ");
			
			for(int j=1;j<=11;j++)
				if(i==6 || i+j==7 || j-i==5)
					System.out.print("*  ");
				else
					System.out.print("  ");
		
		System.out.println();
		}
	}
	
}