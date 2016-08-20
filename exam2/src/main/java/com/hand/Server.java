package com.hand;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server {

	public static void main(String[] args) {
		Thread ThreadName = new Thread();
		ThreadName.start();
		File file = new File("target.pdf");
		Socket s;
		try {
			s = new Socket("10.1.31.69",10002);
			OutputStream out = s.getOutputStream();
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			String line;
			while ((line = br.readLine())!=null) {
				out.write(line.getBytes());
			s.close();
			}
			br.close();
			isr.close();
			fis.close();
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		

	}

}
