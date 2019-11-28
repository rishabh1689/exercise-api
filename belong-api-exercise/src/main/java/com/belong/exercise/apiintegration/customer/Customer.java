package com.belong.exercise.apiintegration.customer;

public class Customer {

	private String customerNumber;
	private String phoneNumber;
	private String phoneNumberStatus;
	private String familyName;
	private String givenNames;

	public String getPhoneNumberStatus() {
		return phoneNumberStatus;
	}

	public void setPhoneNumberStatus(String phoneNumberStatus) {
		this.phoneNumberStatus = phoneNumberStatus;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getGivenNames() {
		return givenNames;
	}

	public void setGivenNames(String givenNames) {
		this.givenNames = givenNames;
	}

}
