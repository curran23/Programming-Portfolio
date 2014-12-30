/**
 * A bank account has a balance that can only be changed by
 * deposits and withdrawals.
 */
 
public class BankAccount {
	// balance variable used for keeping the balance of the account being used
	private double balance;

	/**
	 * Constructs a bank account with a zero balance.
	 */
	public BankAccount() {
		// when a new bank account is created the balance is by default set to 0
		balance = 0;

	}
	/**
	 Constructs a bank account with a given balance.
	 @param initialBalance the initial balance. 
	 */
	public BankAccount(double initialBalance) {
		// set the balance of the bank account to the variable passed in
		balance = initialBalance;
	}
	/** 
	 Deposits money into the bank account.
	 @param amount the amount to deposit.
	 */
	public void deposit(double amount) {
		//amount of the deposit gets added to the balance
		balance = balance + amount;
	}
	/**
	 Withdraws money from the bank account.
	 @param amount the amount to withdraw
	 */
	public void withdraw(double amount) {
		//amount of withdrawal is subtracted from the balance
		balance = balance - amount;
	}
	/**
	 Gets the current balance of the bank account
	 @return the current balance
	 */
	public double getBalance() {
		//give the current balance
		return balance;
	}
	
	
}

