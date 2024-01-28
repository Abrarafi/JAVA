package JavaSocketProgramming;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class server {
	public static void main(String args[])throws IOException
	{
		ServerSocket ss = new ServerSocket(8000);
		Scanner input = new Scanner(System.in);
		
		while(true)
		{
		Socket s=ss.accept();
		System.out.print("Client massage: ");
		InputStream sIn=s.getInputStream();
		DataInputStream dis = new DataInputStream(sIn);
		String st = new String(dis.readUTF());
		System.out.println(st);
		
		OutputStream sOut = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(sOut);
		
		System.out.print("Write massage: ");
		String stOut;
		stOut= input.nextLine();
		dos.writeUTF(stOut);
		
		if(st=="exit" || stOut=="exit")
		{
			dos.close();
			sIn.close();
			sOut.close();
			s.close();
			ss.close();
			input.close();
			break;
		}
		
		}
	}
}
