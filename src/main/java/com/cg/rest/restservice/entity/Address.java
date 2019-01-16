package com.cg.rest.restservice.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String street;
	private String cityName;
	private Integer pincode;
	private String flatNo;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", cityName=" + cityName + ", pincode=" + pincode + ", flatNo=" + flatNo
				+ "]";
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String street, String cityName, Integer pincode, String flatNo) {
		super();
		this.street = street;
		this.cityName = cityName;
		this.pincode = pincode;
		this.flatNo = flatNo;
	}
	
}
