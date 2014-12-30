package bankaccount;


public class BankAccount implements IBankAccount, IMeasurable, Comparable  
{
	//-----------------------------------------------------
	// Instance Variables
	//-----------------------------------------------------
	private String accountNumber;
	private double balance;
	
	
	//-----------------------------------------------------
	// Constructors
	//-----------------------------------------------------
	/**
    Constructs a bank account with a 0 balance.
    */
	public BankAccount()
	   {   
		  this("unknown",0);
	   }

	   /**
	      Constructs a bank account with a given balance.
	      @param initialBalance the initial balance
	   */
	   public BankAccount(String myAccountNumber, double initialBalance)
	   {  
		  accountNumber = myAccountNumber; 
	      balance = initialBalance;
	   }

	   
	  //-----------------------------------------------------
	  // Class Methods
	  //-----------------------------------------------------  
	   /**
	      Credits money into the bank account.
	      @param amount the amount to credit
	   */
	   public void credit(double amount)
	   {  
	      balance += amount;
	   }

	   /**
	      Debits money from the bank account.
	      @param amount the amount to debit
	   */
	   public void debit(double amount)
	   {   
	      balance -= amount;
	   }

	   public String getAccountNumber()
	   {
		   return accountNumber;
	   }
	   
	   
	   /**
	      Gets the current balance of the bank account.
	      @return the current balance
	   */
	   public double getBalance()
	   {   
	      return balance;
	   }

	   public double getMeasure()
	   {
	      return balance;
	   }

	@Override
	public int compareTo(Object otherObject) 
	{
		BankAccount otherAccount = (BankAccount) otherObject;
		
	
		if (this.balance > otherAccount.balance)
		{
			return 1;
		}
		
		if (this.balance < otherAccount.balance)
		{
			return -1;
		}
		
		return 0;
	}


}
