package com.alv.utils;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class RestUtil {

	public static String urlConnectionGetRequest(String urlRequest) throws Exception {
		URL url = new URL(urlRequest);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.connect();
		
		int responceCode = conn.getResponseCode();
		if(responceCode != 200) {
			System.out.println("Error");
			System.err.println("No respondio " + responceCode);
			throw new Exception("El servidor no respondio");
		} else {
			
			StringBuilder informString = new StringBuilder();
			Scanner scanner = new Scanner(url.openStream());
			while(scanner.hasNext()) {
				informString = informString.append(scanner.nextLine());
			}
			scanner.close();
			System.out.println("----------------------------");
			System.out.println(informString.toString());
			System.out.println("----------------------------");
			return (informString.toString());
			
		}
	}
}
