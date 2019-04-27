package account.account;

import account.reporter.Reporter;

public class PassbookAccount extends Account {

	public PassbookAccount(String name) {
		super(name);
	}

	@Override
	public void accept(Reporter rpt) {
		rpt.visitPassbookAccount(this);
	}

	@Override
	public int getTotalSum() {
		return netMoney;
	}

}
