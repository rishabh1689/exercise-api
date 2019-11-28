package com.belong.exercise.apiintegration.customer;

import java.util.ArrayList;

public class CustomerDataHelper {
	
	public ArrayList<Customer> getMockedUpCustomerData() {
		ArrayList<Customer> customerList = new ArrayList<Customer>();

		Customer customer = new Customer();
		customer.setCustomerNumber("11236");
		customer.setPhoneNumber("0468345219");
		customer.setPhoneNumberStatus("Active");
		customer.setFamilyName("Li");
		customer.setGivenNames("Wen Wen");
		customerList.add(customer);

		Customer customer1 = new Customer();
		customer1.setCustomerNumber("11236");
		customer1.setPhoneNumber("0468345453");
		customer1.setPhoneNumberStatus("Inactive");
		customer1.setFamilyName("Li");
		customer1.setGivenNames("Wen Wen");
		customerList.add(customer1);

		Customer customer2 = new Customer();
		customer2.setCustomerNumber("11236");
		customer2.setPhoneNumber("0468345345");
		customer2.setPhoneNumberStatus("Active");
		customer2.setFamilyName("Li");
		customer2.setGivenNames("Wen Wen");
		customerList.add(customer2);

		Customer customer3 = new Customer();
		customer3.setCustomerNumber("11259");
		customer3.setPhoneNumber("04683452780");
		customer3.setPhoneNumberStatus("Active");
		customer3.setFamilyName("Nair");
		customer3.setGivenNames("Arun");
		customerList.add(customer3);

		Customer customer4 = new Customer();
		customer4.setCustomerNumber("11294");
		customer4.setPhoneNumber("0468296257");
		customer4.setPhoneNumberStatus("Active");
		customer4.setFamilyName("William");
		customer4.setGivenNames("Mark");
		customerList.add(customer4);

		Customer customer5 = new Customer();
		customer5.setCustomerNumber("15636");
		customer5.setPhoneNumber("0468751539");
		customer5.setPhoneNumberStatus("Active");
		customer5.setFamilyName("Martyn");
		customer5.setGivenNames("Adam");
		customerList.add(customer5);

		return customerList;
	}

}
