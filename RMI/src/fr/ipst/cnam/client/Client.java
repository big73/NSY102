package fr.ipst.cnam.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import fr.ipst.cnam.services.HelloInt;

public class Client {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		// TODO Auto-generated method stub

		HelloInt od = (HelloInt) Naming.lookup("rmi://localhost:9100/HELLO");
		String mesg;
		try {
			mesg = od.getMessageHello();
			System.out.println(mesg);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
