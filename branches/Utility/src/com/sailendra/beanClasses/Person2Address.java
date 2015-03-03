package com.sailendra.beanClasses;

public class Person2Address
{
	private int houseNo;
	private String streetName;
	private String cityName;
	private String districtName;
	private String stateName;
	private String countryName;
	private long pinNo;

	public int getHouseNo()
	{
		return houseNo;
	}
	public void setHouseNo(int houseNo)
	{
		this.houseNo = houseNo;
	}
	public String getStreetName()
	{
		return streetName;
	}
	public void setStreetName(String streetName)
	{
		this.streetName = streetName;
	}
	public String getCityName()
	{
		return cityName;
	}
	public void setCityName(String cityName)
	{
		this.cityName = cityName;
	}
	public String getDistrictName()
	{
		return districtName;
	}
	public void setDistrictName(String districtName)
	{
		this.districtName = districtName;
	}
	public String getStateName()
	{
		return stateName;
	}
	public void setStateName(String stateName)
	{
		this.stateName = stateName;
	}
	public String getCountryName()
	{
		return countryName;
	}
	public void setCountryName(String countryName)
	{
		this.countryName = countryName;
	}
	public long getPinNo()
	{
		return pinNo;
	}
	public void setPinNo(long pinNo)
	{
		this.pinNo = pinNo;
	}
	
	public String displayInfo()
	{
//		System.out.println("House Number: "+houseNo);
//		System.out.println("Street Name: "+streetName);
//		System.out.println("City Name: "+cityName);
//		System.out.println("District Name: "+districtName);
//		System.out.println("State Name: "+stateName);
//		System.out.println("Country Name: "+countryName);
//		System.out.println("Pin Number: "+pinNo);
		
		return "House Number: "+houseNo+"\n"+"Street Name: "+streetName+"\n"+"City Name: "+cityName+"\n"+"District Name: "+districtName+"\n"+"State Name: "+stateName+"\n"+"Country Name: "+countryName+"\n"+"Pin Number: "+pinNo;
	}
}
