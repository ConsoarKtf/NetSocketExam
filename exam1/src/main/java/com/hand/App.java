package com.hand;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class App 
{


	public static void main( String[] args )
	{
		URL url = null;
		try {
			url = new URL("http://files.saas.hand-china.com/java/target.pdf");
			FileOutputStream fos = new FileOutputStream("target.pdf");
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		    PrintWriter pw= new PrintWriter(osw);
			URLConnection connection = null;
			connection = url.openConnection();
			InputStream is = null;
			is = connection.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(isr);
			String line;
			while((line=br.readLine())!=null){
				System.out.println(line);
				pw.println(line);
				}
			pw.flush();
			pw.close();
			br.close();
			isr.close();
			is.close();
		} catch (MalformedURLException e2) {

			e2.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}


	}


}
