package com.restdownloader.network;

import java.util.List;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONObject;
import com.restdownloader.parsing.Data;


/**
 * The Class that represents the response from the API.
 */
public class ResponseAPI {

	/** The json from the API*/
	private JSONArray json;

	
	/**
	 * Instantiates a new response api.
	 *
	 * @param data the data
	 */
	public ResponseAPI(String data) {
		this.json = new JSONArray(data);
	}

	/**
	 * Parses the json and return a List of Java Beans.
	 *
	 * @return list of Java Beans
	 */
	public List<Data> parse() {

		List<Data> list = new Vector<Data>();

		for (int i = 0; i < this.json.length(); i++) {

			JSONObject object = this.json.getJSONObject(i);
			
			Data data = new Data();
			data.set_id((Integer) object.get("_id"));
			data.setName(object.getString("name"));
			JSONObject geoPosition = object.getJSONObject("geo_position");
			data.setLatitude((Double) geoPosition.get("latitude"));
			data.setLongitude((Double) geoPosition.get("longitude"));
			list.add(data);

		}

		return list;
	}

}
