import java.rmi.Remote;
import java.rmi.RemoteException;


public interface BloomFilterInterface extends Remote {
	
	public boolean isPresent(String str) throws RemoteException; 

}
