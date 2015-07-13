package com.restdownloader.network;

import java.io.IOException;
import java.util.List;

import com.restdownloader.parsing.CSVFile;
import com.restdownloader.parsing.Data;

public class Client {
	
		
	public void run(String arg) throws IOException {
		
		RequestAPI request = new RequestAPI("http://api.goeuro.com/api/v2/position/suggest/en/" + arg);
		ResponseAPI response = request.send();
		List<Data> data = response.parse();
		CSVFile.createFile(data);
	}

}
