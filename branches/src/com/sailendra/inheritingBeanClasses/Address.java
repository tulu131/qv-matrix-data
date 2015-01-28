package com.sailendra.inheritingBeanClasses;

public class Address
{
	private String streetName;
	private String cityName;
	private String districtName;
	private String stateName;
	private String countryName;
	
	public Address()
	{
		System.out.println("Inside default constructor........");
	}
	
	public Address(String streetName, String cityName, String districtName, String stateName, String countryName)
	{
		super();
		this.streetName = streetName;
		this.cityName = cityName;
		this.districtName = districtName;
		this.stateName = stateName;
		this.countryName = countryName;
	}
	
	@Override
	public String toString()
	{
		return streetName+", "+cityName+", "+districtName+", "+stateName+", "+countryName+".";
	}
}
