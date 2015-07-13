package com.restdownloader.network;

import java.io.IOException;

import com.jcabi.http.Response;
import com.jcabi.http.request.ApacheRequest;


public class RequestAPI {

	private String url;
	private ApacheRequest request;
	
	public RequestAPI(String url) {
		this.url = url;
		this.request = new ApacheRequest(url);
	}
	
	public ResponseAPI send() throws IOException
	{
		Response response;
		response = this.request.fetch();
		int status = response.status();
		System.out.println("url " + this.url + " response status code " + status);
		String body = response.body();
		return new ResponseAPI(body);
	}
	

	
}
