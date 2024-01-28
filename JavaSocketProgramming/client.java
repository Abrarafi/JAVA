package JavaSocketProgramming;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class client {
	public static void main(String args[]) throws IOException
	{
		Socket s = new Socket("localhost",8000);

		Scanner input = new Scanner(System.in);

		while(true)
		{
			System.out.print("Write message: ");
		OutputStream sOut = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(sOut);
		String stOut= input.nextLine();
		dos.writeUTF(stOut);

		InputStream sIn = s.getInputStream();
		DataInputStream dis = new DataInputStream(sIn);
		String st = new String(dis.readUTF());
		System.out.print("Server message: ");
		System.out.println(st);

		if(st=="0" || stOut=="0")
		{

			break;
		}




		}


	}
		
		
		
	}
}
