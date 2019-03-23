package dealer;

import dealer.base.Notice;
import dealer.base.Wrapper;
import dealer.exception.DealerNotFoundException;
import dealer.goods.Exchange;
import dealer.goods.Fund;
import dealer.goods.Stock;
import dealer.server.Market;

public abstract class Dealer {
	// �̺�Ʈ�� ó������ ���� ���, �̺�Ʈ�� ó���� ���ӹ��� Dealer��ü
	private Dealer nextdealer;

	// �߻��� �̺�Ʈ�� ���� ������ Ŭ���̾�Ʈ�� �뺸�� �� �ִ� ��ü
	protected Market market;

	protected static Stock stocks[];
	protected static Fund funds[];
	protected static Exchange exchanges[];

	// �����ͺ��̽��� ���� wrapperŬ����
	protected static Wrapper wrap = Wrapper.getInstance();

	public Dealer() {

	}

	public Dealer getNextdealer() {
		return nextdealer;
	}

	public void setNextdealer(Dealer nextdealer) {
		this.nextdealer = nextdealer;
	}

	// �̺�Ʈ ó��
	public abstract boolean getSolution(Notice notice);

	// Ŭ���̾�Ʈ�� �̺�Ʈ�� �뺸
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
