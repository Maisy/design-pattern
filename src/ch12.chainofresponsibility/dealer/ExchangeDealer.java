package dealer;

import java.rmi.RemoteException;

import dealer.base.Constants;
import dealer.base.Notice;
import dealer.server.Market;

public class ExchangeDealer extends Dealer {

	public ExchangeDealer(Market market) {
		this.market = market;
	}

	@Override
	public boolean getSolution(Notice notice) {
		boolean flag = false;
		String code = null;

		code = notice.getCode();
		if (code == null) {
			System.out.println("Exchange dealer has not been yet");
		} else {
			if ("Exchange++".equals(code) || "Exchange--".equals(code)) {
				flag = true;
				exchanges = wrap.getAllExchanges();
			}
		}
		return flag;
	}

	@Override
	public void sendMessageToClient() {
		try {
			market.sendMessageToClient(stocks, Constants.Exchange);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
