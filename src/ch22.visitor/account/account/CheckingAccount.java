package account.account;

import account.reporter.Reporter;

public class CheckingAccount extends Account {

	public CheckingAccount(String name) {
		super(name);
	}

	@Override
	public void accept(Reporter rpt) {
		rpt.visitCheckingAccount(this);
	}

	@Override
	public int getTotalSum() {
		return netMoney;
	}

}
