package com.restdownloader.parsing;


/**
 * Java Bean that represents the data that has to be stored in the csv file
 */
public class Data {

	/** The _id. */
	private Integer _id;

	/** The name. */
	private String name;

	/** The latitude. */
	private Double latitude;

	/** The longitude. */
	private Double longitude;

	/**
	 * Gets the _id.
	 *
	 * @return the _id
	 */
	public Integer get_id() {
		return _id;
	}

	/**
	 * Sets the _id.
	 *
	 * @param _id the new _id
	 */
	public void set_id(Integer _id) {
		this._id = _id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the latitude.
	 *
	 * @return the latitude
	 */
	public Double getLatitude() {
		return latitude;
	}

	/**
	 * Sets the latitude.
	 *
	 * @param latitude the new latitude
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	/**
	 * Gets the longitude.
	 *
	 * @return the longitude
	 */
	public Double getLongitude() {
		return longitude;
	}

	/**
	 * Sets the longitude.
	 *
	 * @param longitude the new longitude
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Data [_id=" + _id + ", name=" + name + ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}

}
