package com.restdownloader.network;

import java.util.List;
import java.util.Vector;

import org.json.JSONArray;
import org.json.JSONObject;

import com.restdownloader.parsing.Data;

public class ResponseAPI {

	private JSONArray json;

	public ResponseAPI(String data) {
		this.json = new JSONArray(data);
	}

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
