package bankaccount;

import java.io.IOException;
import java.util.Collection;

public interface IBank 
{
	public double getNetWorth();
	public Collection getOverdrawnAccounts();	
	public void addAccount(IBankAccount aAccount);
	public double getAccountBalance(String myAccountNumber);
	public IBankAccount getAccount(int index);
	public void saveAccounts() throws IOException;
}
