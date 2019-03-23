package dealer;

import java.rmi.RemoteException;

import dealer.base.Constants;
import dealer.base.Notice;
import dealer.server.Market;

public class StockDealer extends Dealer {

	public StockDealer(Market market) {
		this.market = market;
	}

	@Override
	public boolean getSolution(Notice notice) {
		boolean flag = false;
		String code = null;

		code = notice.getCode();
		if (code == null) {
			System.out.println("Stock dealer has not been yet");
		} else {
			if ("Stock++".equals(code) || "Stock--".equals(code)) {
				flag = true;
				stocks = wrap.getAllStocks();
			}
		}
		return flag;
	}

	@Override
	public void sendMessageToClient() {
		try {
			market.sendMessageToClient(stocks, Constants.Stock);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
