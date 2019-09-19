import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BloomFilterClass implements BloomFilterInterface {

	protected BloomFilterClass() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isPresent(String str) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println(str);
		if(str.equalsIgnoreCase("akshay"))
			return true;
		
		return false;
	}

}
