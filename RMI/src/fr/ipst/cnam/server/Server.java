package fr.ipst.cnam.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import fr.ipst.cnam.services.HelloOD;

public class Server {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		try {
			LocateRegistry.createRegistry(9100);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			HelloOD od = new HelloOD(9100, "Hello World !");
			Naming.rebind("rmi://localhost:9100/HELLO", od);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
