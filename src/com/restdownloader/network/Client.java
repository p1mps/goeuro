package com.restdownloader.network;

import java.io.IOException;
import java.util.List;
import com.restdownloader.parsing.CSVFile;
import com.restdownloader.parsing.Data;

/**
 * The Client that makes the request to the API and creates the csv file
 */
public class Client {
	
		
	/**
	 * Run the client.
	 * @param arg the arg
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void run(String arg) throws IOException {
		
		RequestAPI request = new RequestAPI("http://api.goeuro.com/api/v2/position/suggest/en/" + arg);
		ResponseAPI response = request.send();
		List<Data> data = response.parse();
		if(data.size() > 0)		
			CSVFile.createFile(data);
	}

}
