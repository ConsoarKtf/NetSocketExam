package com.hand;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Client 
{
    public static void main( String[] args )
    {
    	try {
    	File newfile = new File("newtarget.pdf");
		FileOutputStream fos = new FileOutputStream(newfile);
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
	
			ServerSocket ss = new ServerSocket(10002);
			Socket s = ss.accept();
		
			InputStream in = s.getInputStream();
			byte[] buf = new byte[1024];
			int len = in.read(buf);
			String text = new String(buf,0,len);
			while (text!=null) {
	            bw.write(text);
				}
			bw.close();
			osw.close();
			fos.close();
			s.close();
			ss.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    }
}
