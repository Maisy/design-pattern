package account.test;

import java.util.ArrayList;
import java.util.List;

import account.account.Account;
import account.account.CheckingAccount;
import account.account.PassbookAccount;
import account.reporter.HistoryReporter;
import account.reporter.Reporter;
import account.reporter.TotalSumReporter;

public class AccountTest {

	public static void main(String[] args) {
		PassbookAccount a, b;
		a = new PassbookAccount("영희");
		b = new PassbookAccount("철수");
		CheckingAccount c, d;
		c = new CheckingAccount("아빠");
		d = new CheckingAccount("엄마");

		List<Account> accountList = new ArrayList<>();
		accountList.add(a);
		accountList.add(b);
		accountList.add(c);
		accountList.add(d);

		TotalSumReporter sumRpt = new TotalSumReporter();
		HistoryReporter histRpt = new HistoryReporter();

		a.deposit(1000);
		b.deposit(2000);
		c.deposit(3000);
		d.deposit(4000);

		doReport(accountList, sumRpt);

		System.out.println("withdrawwwww");
		a.withdraw(500);
		c.withdraw(1000);

		doReport(accountList, histRpt);
		System.out.println();
		doReport(accountList, sumRpt);
	}

	private static void doReport(List<Account> accountList, Reporter rpt) {
		for (Account account : accountList) {
			account.accept(rpt);
		}
	}

}
