
public class BankAccountProgram {

	/**
	 Tests the BankAccount file to work properly
	 */
	public static void main(String[] args) {
		BankAccount initialZero = new BankAccount();
		BankAccount initial5000 = new BankAccount(5000);
		initialZero.deposit(2500);
		initial5000.withdraw(600);
		int zeroBalance = (int) initialZero.getBalance();
		int nonZeroBalance = (int) initial5000.getBalance();
		System.out.println("1st account expected 2500, 2nd account expected 4400");
		System.out.println(zeroBalance);
		System.out.println(nonZeroBalance);

	}

}
