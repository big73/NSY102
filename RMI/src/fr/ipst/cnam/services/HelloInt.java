package fr.ipst.cnam.services;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloInt extends Remote {

	public String getMessageHello() throws RemoteException;
}
