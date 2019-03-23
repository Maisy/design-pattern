package dealer.server;

import java.rmi.RemoteException;

import dealer.Dealer;
import dealer.ExchangeDealer;
import dealer.FundDealer;
import dealer.StockDealer;

public class MarketServer {
	public static void main(String args[]) {
		try {
			Market marketRef = new MarketImpl();

			Dealer[] dealers = { new StockDealer(marketRef), new FundDealer(marketRef), new ExchangeDealer(marketRef) };

			for (int i = 0; i < dealers.length - 1; i++) {
				dealers[i].setNextdealer(dealers[i + 1]);
			}

			Emitter emit = new Emitter(dealers);
			emit.run();
			System.out.println("END");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
