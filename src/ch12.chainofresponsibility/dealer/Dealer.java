package dealer;

import dealer.base.Notice;
import dealer.base.Wrapper;
import dealer.exception.DealerNotFoundException;
import dealer.goods.Exchange;
import dealer.goods.Fund;
import dealer.goods.Stock;
import dealer.server.Market;

public abstract class Dealer {
	// 이벤트를 처리하지 못할 경우, 이벤트에 처리를 위임받을 Dealer객체
	private Dealer nextdealer;

	// 발생한 이벤트에 대한 정보를 클라이언트에 통보할 수 있는 객체
	protected Market market;

	protected static Stock stocks[];
	protected static Fund funds[];
	protected static Exchange exchanges[];

	// 데이터베이스에 대한 wrapper클래스
	protected static Wrapper wrap = Wrapper.getInstance();

	public Dealer() {

	}

	public Dealer getNextdealer() {
		return nextdealer;
	}

	public void setNextdealer(Dealer nextdealer) {
		this.nextdealer = nextdealer;
	}

	// 이벤트 처리
	public abstract boolean getSolution(Notice notice);

	// 클라이언트에 이벤트를 통보
	public abstract void sendMessageToClient();

	public void sendMessage(Notice notice) {
		if (getSolution(notice)) {
			sendMessageToClient();
		} else if (getNextdealer() == null) {
			try {
				throw new DealerNotFoundException();
			} catch (DealerNotFoundException e) {
				System.out.println(e);
			}
		} else {
			System.out.println(this.getClass().getName() + " => " + nextdealer.getClass().getName());
			nextdealer.sendMessage(notice);
		}
	}
}
