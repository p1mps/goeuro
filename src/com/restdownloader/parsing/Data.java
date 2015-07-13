package com.restdownloader.parsing;

public class Data {

	//_id, name, type, latitude, longitude
	
	private Integer _id;
	
	private String name;
	
	private Double latitude;
	
	private Double longitude;

	public Integer get_id() {
		return _id;
	}

	public void set_id(Integer _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "Data [_id=" + _id + ", name=" + name + ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}
	
	
}
