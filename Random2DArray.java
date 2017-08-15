public class Arrays
{
	public static void main(String[] args)
	{
		int [][] arrayNumbers = new int[3][4];
		for(int k=0;k<3;k++)
		{
			for(int i=0;i<4;i++)
			{
				arrayNumbers[k][i] = (int)(Math.random()*6);
			}
		}
		
		
		
	System.out.println("The matrix of random numbers is below.");
		for(int k=0; k<3;k++)
		{  
		 for(int l=0;l<4;l++)
		 {
		   System.out.print(arrayNumbers[k][l]+"\t");
		 }
		 System.out.println();
		}
		
     
	 
	  int [] sumRows = new int [3];
	  for(int k=0; k<3;k++)
	  {
	    int sum =0;
		 for (int l=0;l<4;l++)
		 {
			sum += arrayNumbers[k][l];
			}
			
			sumRows[k] =sum;
		}
	
	System.out.println("\n\n\n Below shows a detailed summation of the rows.");
	
	 //Display summation of the rows.
	 System.out.println("   C1   C2   C3   C4   Sum"); 
	 for (int k=0;k<3;k++)
	 { System.out.print("R"+(k+1+" "));
	   for(int l=0;l<4;l++)
		{
		 System.out.print(arrayNumbers[k][l]+"    ");
		}
		System.out.println(sumRows[k]);
	 } 
      
	}
}
