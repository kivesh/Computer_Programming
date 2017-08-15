import java.util.Scanner;
public class errorCatching
{
	public static void main(String[] args)
	{    int num;
		  boolean checkType = false;
		  while(checkType==false)
		  {
		  	try
		   { Scanner kb = new Scanner(System.in);
		     System.out.println("Please enter an integer");
			  num = kb.nextInt();
			  checkType = true;
		   }
		   catch(Exception e)
		   {		   
		   System.out.println("\nNot an integer! Try again.");
		   }
		  }
		  
		 System.out.println("Thanks for entering an integer.");
	}
}
