package bank.checker;

public class AccountNumberCheck {
	private int accountNumber = 12345678;

	public int getAccountNumber() {
		return accountNumber;
	}

	public boolean accountActive(int accNumToCheck) {
		if (accNumToCheck == getAccountNumber()) {
			return true;
		} else {
			return false;
		}
	}
}
