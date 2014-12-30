package bankaccount;

public interface IBankAccount 
{
	public double getBalance();
	public void credit(double amount);
	public void debit(double amout);
}
