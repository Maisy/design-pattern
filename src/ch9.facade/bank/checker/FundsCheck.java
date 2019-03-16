package bank.checker;

public class FundsCheck {
	private double cashInAccount = 1000.00;

	public double getCashInAccount() {
		return cashInAccount;
	}

	public void decreaseCashInAccount(double cashWithdrawn) {
		cashInAccount -= cashWithdrawn;
	}

	public void increaseCashInAccount(double cashDeposited) {
		cashInAccount += cashDeposited;
	}

	public boolean haveEnoughMoney(double cashToWithdrawal) {
		if (cashToWithdrawal > getCashInAccount()) {
			System.out.println("you don't have enoughmoney");
			System.out.println("current balance: " + getCashInAccount());
			return false;
		} else {
			decreaseCashInAccount(cashToWithdrawal);
			System.out.println("withdrawal complete! : current balance: " + getCashInAccount());
			return true;
		}
	}

	public void makeDeposit(double cashTodeposit) {
		increaseCashInAccount(cashTodeposit);
		System.out.println("Deposit complete! : current balance: " + getCashInAccount());

	}
}
