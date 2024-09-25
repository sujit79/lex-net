package  com.lexnet.component;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class LexNetServer implements Runnable{
	
	private LexNetServiceBus lexNetServiceBus1;
	private LexNetServiceBus lexNetServiceBus2;
	private ServerSocket server1;
	private ServerSocket server2;
	
	public ServerSocket getServer1() {
		return server1;
	}

	public void setServer1(ServerSocket server1) {
		this.server1 = server1;
	}

	public ServerSocket getServer2() {
		return server2;
	}

	public void setServer2(ServerSocket server2) {
		this.server2 = server2;
	}

	public LexNetServer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LexNetServer(String []argv){
		
		LexNetProtocolBus lexNetBus = new LexNetProtocolBus();
		LexNetProtocolBus lexNetBus1 = new LexNetProtocolBus();
		
		lexNetBus.setPATH(argv[4]);
		lexNetBus.setPORT(argv[3]);
		lexNetBus.setURL(argv[2]);
		lexNetBus.setPROTOCOL(argv[1]);
		
		LexNetProtocol lexNetProto = new LexNetProtocol(lexNetBus);
		LexNetServiceBus lexNetServiceBus1 = new LexNetServiceBus(lexNetProto);
		
		this.lexNetServiceBus1 = lexNetServiceBus1;
		
		lexNetBus1.setPATH(argv[8]);
		lexNetBus1.setPORT(argv[7]);
		lexNetBus1.setURL(argv[6]);
		lexNetBus1.setPROTOCOL(argv[5]);
		
		LexNetProtocol lexNetProto1 = new LexNetProtocol(lexNetBus1);
		LexNetServiceBus lexNetServiceBus2 = new LexNetServiceBus(lexNetProto1);
		
		this.lexNetServiceBus2 = lexNetServiceBus2;
		
		Thread serverThread = new Thread(this);
		
		serverThread.start();
	}
	
	LexNetServiceBus getlexNetServiceBus2(LexNetServiceBus lexNetServiceBus1){
		//return same directly with the service bus 2 without any transformation.
		return lexNetServiceBus2;
	}
	
	public void run(){
		// TODO Auto-generated method stub
		try {
			System.out.println("Pass 1 " + lexNetServiceBus1.getLexNetProto().getLexNetProto().getPORT());
			server1 = new ServerSocket(Integer.parseInt(lexNetServiceBus1.getLexNetProto().getLexNetProto().getPORT()));
			
			System.out.println("URL :: " + lexNetServiceBus1.getLexNetProto().getLexNetProto().getPROTOCOL() 
					+ lexNetServiceBus1.getLexNetProto().getLexNetProto().getURL());
			
			InetSocketAddress inetSocAddress1 = new InetSocketAddress(lexNetServiceBus1.getLexNetProto().getLexNetProto().getPROTOCOL() 
					+ lexNetServiceBus1.getLexNetProto().getLexNetProto().getURL(),
					  Integer.parseInt(lexNetServiceBus1.getLexNetProto().getLexNetProto().getPORT()));
			
			//server1.bind(inetSocAddress1);
			Socket client1 = server1.accept();
			System.out.println("URL :: " + lexNetServiceBus2.getLexNetProto().getLexNetProto().getPROTOCOL() 
					+ lexNetServiceBus2.getLexNetProto().getLexNetProto().getURL());
			ObjectInputStream oIn = new ObjectInputStream(client1.getInputStream());
			Object objIn = oIn.readObject();
			
			
			lexNetServiceBus2 = getlexNetServiceBus2(lexNetServiceBus1);
			
			server2 = new ServerSocket(Integer.parseInt(lexNetServiceBus2.getLexNetProto().getLexNetProto().getPORT()));
			
			InetSocketAddress inetSocAddress2 = new InetSocketAddress(lexNetServiceBus2.getLexNetProto().getLexNetProto().getPROTOCOL() 
					+ lexNetServiceBus2.getLexNetProto().getLexNetProto().getURL(),
					  Integer.parseInt(lexNetServiceBus2.getLexNetProto().getLexNetProto().getPORT()));
			
			//server2.bind(inetSocAddress2);
			Socket client2 = server2.accept();
			
			ObjectOutputStream oUt = new ObjectOutputStream(client2.getOutputStream());
			oUt.writeObject(objIn);	
			System.out.println(objIn.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void callMain(String []argv){
		LexNetServer lexNetServer = new LexNetServer(argv);
	}
	public static void main(String []argv){		
		LexNetServer lexNetServer = new LexNetServer(argv);
	}
}
