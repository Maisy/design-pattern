package dealer;

import java.rmi.RemoteException;

import dealer.base.Constants;
import dealer.base.Notice;
import dealer.server.Market;

public class FundDealer extends Dealer {

	public FundDealer(Market market) {
		this.market = market;
	}

	@Override
	public boolean getSolution(Notice notice) {
		boolean flag = false;
		String code = null;

		code = notice.getCode();
		if (code == null) {
			System.out.println("Fund dealer has not been yet");
		} else {
			if ("Fund++".equals(code) || "Fund--".equals(code)) {
				flag = true;
				funds = wrap.getAllFunds();
			}
		}
		return flag;
	}

	@Override
	public void sendMessageToClient() {
		try {
			market.sendMessageToClient(stocks, Constants.Fund);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
