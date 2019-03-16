package bank.checker;

public class SecurityCodeCheck {

	private int securityNumber = 1234;

	public int getSecurityCode() {
		return securityNumber;
	}

	public boolean isCodeCorrect(int secCodeToCheck) {
		return secCodeToCheck == getSecurityCode();
	}
}
