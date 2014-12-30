import java.util.*;

public class BankAccountSort {
	
	public static void main(String[] args) {
		//Create the ArrayList
		ArrayList<BankAccount> list = new ArrayList<BankAccount>();
		//Create the BankAccounts to be added to the list
		
		list.add(new BankAccount(5000));
		list.add(new BankAccount(6000));
		list.add(new BankAccount(1000));
		list.add(new BankAccount(8000));
		list.add(new BankAccount(9000));
		
		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) {
			BankAccount b = list.get(i);
			System.out.println(b.getBalance());
		}
	}
}