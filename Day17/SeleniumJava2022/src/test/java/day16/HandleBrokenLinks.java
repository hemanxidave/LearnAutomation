package day16;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HandleBrokenLinks {

	public static void main(String[] args) throws IOException {
		
		URL url=new URL("https://www.selenium.dev/");
		
		HttpURLConnection connection=(HttpURLConnection)url.openConnection();

		connection.connect();
		
		int code =connection.getResponseCode();

		if(code<400)
		{
			System.out.println("Link working  -URL "+url +" Status "+connection.getResponseMessage());
		}
		else	
		{
			System.out.println("Link Broken - URL "+url +" Status "+connection.getResponseMessage());
		}
		
		
	}

}
