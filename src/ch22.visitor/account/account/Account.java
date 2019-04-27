package account.account;

import java.util.ArrayList;
import java.util.List;

import account.reporter.Reporter;

public abstract class Account {
	int money;
	List<Integer> history;
	String customerName;
	int netMoney;

	Account(String name) {
		history = new ArrayList<Integer>();
		this.netMoney = 0;
		this.customerName = name;
	}

	public abstract void accept(Reporter rpt);

	public abstract int getTotalSum();

	public List<Integer> getHistory() {
		return history;
	};

	public String getCustomerName() {
		return customerName;
	}

	public void deposit(int inMoney) {
		netMoney += inMoney;
		history.add(inMoney);
	}

	public void withdraw(int outMoney) {
		netMoney -= outMoney;
		history.add(outMoney);
	}

}
