package account.reporter;

import account.account.CheckingAccount;
import account.account.PassbookAccount;

// Visitor
public interface Reporter {

	void visitPassbookAccount(PassbookAccount pAccount);

	void visitCheckingAccount(CheckingAccount pAccount);
}
