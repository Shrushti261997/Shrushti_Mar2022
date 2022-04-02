class CodeSnippet1
{
	public static void main(String args[])
	{
//Que1
           
           /*
		   for (int i = 0; i < 10; i++)      //no javac error
		   {								//no java error
            int x = 10;
		   }
		   */

	/* 
	for (int i = 0; i < 10; i++)         
            int x = 10;					//variable declaration not allowed here
		*/
		

				


           //Que2
           
          /* for (int i=0, String S="Mumbai"; i < 2 ; i++) 
            System.out.println("HELLO");    */  //javac error == compilation error

	 /*for (String i="0"; i < 2 ; i++) 
	 System.out.println("HELLO");  */ 

		for (String i="0"; i < 2 ; i++) 
			System.out.println("HELLO"); 


           //Que3
           /*
          //  int i = 0; 
            for ( i=System.out.println("HI"); i < 4; i++) 
            System.out.println("HELLO");
           */



           //Que4
           /*
            for (int i = 0; i < 1; System.out.println("WELCOME")) 
            System.out.println("EDAC");
            */
                 






            //Que5
          /*  
            do { 
            System.out.print(1); 
            do { 
  
                System.out.print(2); 
  
               } while (0); 
  
              } while (1);
			  */
}
}