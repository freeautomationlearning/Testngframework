/**
 * 
 */
package com.freeautomationlearning;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.annotations.Test;

/**
 * @author CHIRAG
 *
 *This script is for Hit Soap Request
 */
public class Tutorial15 {

	String endpoint = "http://www.webservicex.net/medicareSupplier.asmx";
	@Test
	public void getSoapResponse() throws ClientProtocolException, IOException
	{
		File requestFile = new File(System.getProperty("user.dir")+"//Requests//SupplierByCity.xml");
		HttpClient cilent = HttpClientBuilder.create().build();
		HttpPost post = new HttpPost(endpoint);
		post.setEntity(new InputStreamEntity(new FileInputStream(requestFile)));
		post.setHeader("Content-type","text/xml");
		HttpResponse response = cilent.execute(post);
		System.out.println(response.getStatusLine().getStatusCode());
		BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		String line = "";
		StringBuffer sb = new StringBuffer();
		while((line=br.readLine())!=null)
		{
			sb.append(line);
		}
		PrintWriter pw = new PrintWriter(System.getProperty("user.dir")+"//Response//ResponseSupplierCity.xml");
		pw.write(sb.toString());
		pw.close();
		pw.flush();
	}
}
