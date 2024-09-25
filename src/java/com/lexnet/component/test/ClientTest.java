package com.lexnet.component.test;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

import com.lexnet.component.LexNetServer;

public class ClientTest {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		testServer();
	}
	public static void testServer() throws IOException{
		InetSocketAddress inetSocAddress1 = new InetSocketAddress("localhost", 40001);
		Socket lClient = new Socket();
		lClient.connect(inetSocAddress1);
		OutputStream lOut = lClient.getOutputStream();
		lOut.write(1000100);
	}
}
