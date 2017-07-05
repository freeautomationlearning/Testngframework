/**
 * 
 */
package com.freeautomationlearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.annotations.Test;

/**
 * @author CHIRAG
 *
 *This script for Hit Rest GET request
 */
public class Tutorial14 {

	String endpoint ="http://maps.googleapis.com/maps/api/directions/json?origin=Toronto&destination=Montreal";
	
	@Test
	public void getResponseGoogleMaps() throws ClientProtocolException, IOException
	{
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(endpoint);
		HttpResponse response = client.execute(request);
		BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		String line="";
		StringBuffer sb = new StringBuffer();
		while((line=br.readLine())!=null)
		{
			sb.append(line);
		}
		System.out.println(response.getStatusLine().getStatusCode());
		//System.out.println(sb);
		PrintWriter pw = new PrintWriter(System.getProperty("user.dir")+"//Response//googleMap.json");
		pw.write(sb.toString());
		pw.close();
		pw.flush();
	}
	
}
