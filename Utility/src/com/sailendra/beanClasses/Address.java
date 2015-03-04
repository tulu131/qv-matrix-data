package com.sailendra.beanClasses;

/**
 * @author Sailendra.Jena
 *
 */
public class Address
{
	private int houseNo;
	private String streetName;
	private String cityName;
	private String districtName;
	private String stateName;
	private String countryName;
	private long pinNo;

	public Address(int houseNo, String streetName, String cityName, String districtName, String stateName, String countryName, long pinNo)
	{
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.cityName = cityName;
		this.districtName = districtName;
		this.stateName = stateName;
		this.countryName = countryName;
		this.pinNo = pinNo;
	}
	
	@Override
	public String toString()
	{
		return houseNo+",  "+streetName+",  "+cityName+",  "+districtName+",  "+stateName+",  "+countryName+",  "+pinNo;
	}
}
