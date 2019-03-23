package dealer.server;

import java.rmi.RemoteException;
import java.util.Vector;

import dealer.base.Client;

//client는 message를 observing
//public class MarketImpl extends UnicastRemoteObject implements Market {
public class MarketImpl implements Market {

	// client 객체를 등록할 백터 객체
	private Vector<Client> v;

	public MarketImpl() throws RemoteException {
		v = new Vector<Client>();
	}

	@Override
	public void regist(Client c) throws RemoteException {
		v.addElement(c);
	}

	@Override
	public void sendMessageToClient(Object[] obj, String msg) throws RemoteException {
		// TODO
		System.out.println("Send to client: " + msg);
	}

}
