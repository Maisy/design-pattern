package account.reporter;

import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import account.account.CheckingAccount;
import account.account.PassbookAccount;

public class HistoryReporter implements Reporter {

	@Override
	public void visitPassbookAccount(PassbookAccount pAccount) {
		System.out.printf("%s 의 PassbookAccount 입출금내역:", pAccount.getCustomerName());
		List<Integer> hist = pAccount.getHistory();
		for (int data : hist) {
			System.out.print(data + " ");
		}
		System.out.println();

	}

	@Override
	public void visitCheckingAccount(CheckingAccount pAccount) {
		System.out.printf("%s 의 CheckingAccount 입출금내역:", pAccount.getCustomerName());
		List<Integer> hist = pAccount.getHistory();
		for (int data : hist) {
			System.out.print(data + " ");
		}
		System.out.println();
	}

}
