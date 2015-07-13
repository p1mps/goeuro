package com.restdownloader.network;

import java.io.IOException;
import com.jcabi.http.Response;
import com.jcabi.http.request.ApacheRequest;


/**
 * The Class that represents a request to the API.
 */
public class RequestAPI {

	/** The url. */
	private String url;
	
	/** The request. */
	private ApacheRequest request;
	
	/**
	 * Instantiates a new request api.
	 *
	 * @param url the url
	 */
	public RequestAPI(String url) {
		this.url = url;
		this.request = new ApacheRequest(url);
	}
	
	/**
	 * Send.
	 *
	 * @return the response api
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public ResponseAPI send() throws IOException
	{
		Response response;
		response = this.request.fetch();
		String body = response.body();
		return new ResponseAPI(body);
	}
	
}
