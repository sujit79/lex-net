package com.lexnet.component.test;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

import com.lexnet.component.LexNetServer;

public class ServerTest {
	
	public static void main(String []argv) throws IOException{
		String []params = {"","http://","localhost","40001","/domain",
				"http://","localhost","50001","/domain"}; 
		LexNetServer lServer = new LexNetServer(params);
	}	
}
