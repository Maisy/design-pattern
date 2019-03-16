package bank;

import bank.checker.AccountNumberCheck;
import bank.checker.FundsCheck;
import bank.checker.SecurityCodeCheck;

public class BankAccountFacade {

	private int accountNumber;
	private int securityCode;
	AccountNumberCheck acctChecker;
	SecurityCodeCheck codeChecker;
	FundsCheck fundChecker;

	WelcomeToBank bankWelcome;

	public BankAccountFacade(int newAccotNum, int newSecCode) {
		accountNumber = newAccotNum;
		securityCode = newSecCode;

		bankWelcome = new WelcomeToBank();
		acctChecker = new AccountNumberCheck();
		codeChecker = new SecurityCodeCheck();
		fundChecker = new FundsCheck();
	}

	private int getAccountNumber() {
		return accountNumber;
	}

	private int getSecurityCode() {
		return securityCode;
	}

	public void withdrawCash(double cashToGet) {
		if (acctChecker.accountActive(getAccountNumber()) && codeChecker.isCodeCorrect(getSecurityCode())
				&& fundChecker.haveEnoughMoney(cashToGet)) {
			System.out.println("Transaction Complete");
		} else {
			System.out.println("Transaction Failed");
		}
	}

	public void depositCash(double cashToDeposit) {
		if (acctChecker.accountActive(getAccountNumber()) && codeChecker.isCodeCorrect(getSecurityCode())) {
			fundChecker.makeDeposit(cashToDeposit);
			System.out.println("Transaction Complete");
		} else {
			System.out.println("Transaction Failed");
		}
	}

}
