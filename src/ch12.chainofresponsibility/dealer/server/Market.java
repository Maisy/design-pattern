package dealer.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

import dealer.base.Client;

public interface Market extends Remote {
	public void regist(Client c) throws RemoteException;

	public void sendMessageToClient(Object [] obj, String msg) throws RemoteException;

}
	