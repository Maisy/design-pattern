package account.reporter;

import account.account.CheckingAccount;
import account.account.PassbookAccount;

public class TotalSumReporter implements Reporter {

	@Override
	public void visitPassbookAccount(PassbookAccount pAccount) {
		System.out.printf("%s 의 PassbookAccount Total Sum: %d\n", pAccount.getCustomerName(),
				pAccount.getTotalSum());
	}

	@Override
	public void visitCheckingAccount(CheckingAccount pAccount) {
		System.out.printf("%s 의 CheckingAccount Total Sum: %d\n", pAccount.getCustomerName(),
				pAccount.getTotalSum());
	}

}
