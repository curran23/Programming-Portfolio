package bankaccount;

import java.sql.SQLException;

public interface IBankAccount 
{
	public double getBalance();
	public void credit(double amount);
	public void debit(double amout);
	public void save() throws SQLException;
}
