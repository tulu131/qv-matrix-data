package com.sailendra.beanClasses;

public class PermanentAddress
{
	private int houseNo;
	private String streetName;
	private String cityName;
	private String districtName;
	private String stateName;
	private String countryName;
	private long pinNo;
	
	public PermanentAddress(int houseNo, String streetName, String cityName, String districtName, String stateName, String countryName, long pinNo)
	{
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.cityName = cityName;
		this.districtName = districtName;
		this.stateName = stateName;
		this.countryName = countryName;
		this.pinNo = pinNo;
	}
	
	public String show()
	{
		return houseNo+", "+streetName+", "+cityName+", "+districtName+", "+stateName+", "+countryName+", "+"Pin No: "+pinNo+".";
	}
}
