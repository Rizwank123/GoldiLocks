package com.masai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpRestTemplate {

	public static void main(String[] args) throws IOException {
		
		
		String url = "http://127.0.0.1:8999/test?value=p";
			URL obj=new URL(url);
			
			 HttpURLConnection conn = (HttpURLConnection) obj.openConnection();			conn.setRequestMethod("GET");
			int responseCode=conn.getResponseCode();
			System.out.println("Http Response"+responseCode);
			
			if(responseCode==HttpURLConnection.HTTP_OK) {
				BufferedReader in =new BufferedReader(new InputStreamReader(conn.getInputStream()));
				
				String inputLine;
				StringBuilder response=new StringBuilder();
				while((inputLine=in.readLine())!=null){
					response.append(inputLine);
				}
				in.close();
				
				
				System.out.println("HTTP Response:");
				
				System.out.println(response.toString());
			}else System.out.println("HTTP request failed");

	}

}
