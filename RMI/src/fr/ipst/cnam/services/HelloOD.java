package fr.ipst.cnam.services;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloOD extends UnicastRemoteObject implements HelloInt{

	private String message = null;
	
	public HelloOD(int portSocket, String msg) throws RemoteException
	{
		super(portSocket);
		this.message = msg;	
	}
	
	@Override
	public String getMessageHello() throws RemoteException {
		// TODO Auto-generated method stub
		return this.message;
	}

}
