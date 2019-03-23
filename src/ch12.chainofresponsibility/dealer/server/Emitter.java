package dealer.server;

import dealer.Dealer;
import dealer.base.Notice;

public class Emitter {
	private Dealer[] dealer;
	private Notice notice;

	public Emitter(Dealer[] dealer) {
		this.dealer = dealer;
	}

	public Notice getNotice() {
		return notice;
	}

	public void run() {
		// event
		String[] eventlist = { "Fund++", "Stock--", "Stock++", "Exchange++" ,"excption"};
		for (String code : eventlist) {
			notice = new Notice(code);
			notifyToDealer();
		}
	}

	private void notifyToDealer() {
		dealer[0].sendMessage(notice);
	}
}
