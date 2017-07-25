import java.util.Scanner;
class Bank
{

 String accountNumber;
 double balance;
 String accountOwner;
	
	
	Bank(String accNumber, double Bal, String accOwn)
	{
	 accountNumber = accNumber;
	 balance= Bal;
	 accountOwner = accOwn;
	}
	
	
	void deposit(double amount)
	{
	 balance = balance +amount;
	}
	
	
	void cheque( double amount)
	{
	 balance = balance - amount;
	}
	
	String getAccountNumber()
	{
	 return accountNumber;
	}
	
	double getBalance()
	{
	 return balance;
	}
	
	String getAccountOwner()
	{
	 return accountOwner;
	}
	
}

public class Banking
{
	public static void main(String [] args)
	{
	 	 Bank op = new Bank("217001412", 36000.50, "Kivesh");
		 System.out.println("The opening balance is "+op.getBalance()+"\n\n\n");
		 Scanner kb = new Scanner(System.in);
		 System.out.println("Do you want to make a deposit (Yes/No)");
		 String choice= kb.nextLine();
		 if (choice.equalsIgnoreCase("Yes"))
		 {
		  System.out.println("Please enter the amount to deposit");
		  double amnt = kb.nextDouble();
		  op.deposit(amnt);
		  System.out.println("Your new balance is now: R"+ op.getBalance()+"\n\n\n");
		  }
		 System.out.println("Do you need to make a cheque (Yes/NO) ?");
		 String choice2 = kb.nextLine();
		 if (choice2.equalsIgnoreCase("yes"))
		 {
       System.out.println("Please enter the amount you want to recieve :");
		 double amnt= kb.nextDouble();
		 op.cheque(amnt);
		 System.out.println("Your new balance is: R"+ op.getBalance()+"\n\n\n");
		  }
		  
	}
}
