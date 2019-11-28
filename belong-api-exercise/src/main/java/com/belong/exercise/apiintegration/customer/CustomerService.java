package com.belong.exercise.apiintegration.customer;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class CustomerService {

	@RequestMapping(value = "/getAllPhoneNumbers", method = RequestMethod.GET, produces = { "application/json" })
	public String getAllPhoneNumbers() {

		String response = StringUtils.EMPTY;
		CustomerDataHelper customerDataHelper = new CustomerDataHelper();

		ArrayList<Customer> customerList = new ArrayList<Customer>();
		customerList = customerDataHelper.getMockedUpCustomerData();

		if (null != customerList && customerList.size() > 0) {
			Iterator<Customer> iter = customerList.iterator();
			while (iter.hasNext()) {
				Customer customer = iter.next();
				if (null != customer.getPhoneNumber() && customer.getPhoneNumber() != StringUtils.EMPTY) {
					response = response + "'" + customer.getPhoneNumber().toString() + "'";
				}
			}
		} else {
			response = "Unable to process requests currently";
		}
		return response;
	}

	@RequestMapping(value = "/getCustomerPhoneNumbers", method = RequestMethod.GET, produces = { "application/json" })
	public String getCustomerPhoneNumbers(@RequestParam String customerId) {

		String response = StringUtils.EMPTY;
		Boolean customerIdExists = false;
		
		CustomerDataHelper customerDataHelper = new CustomerDataHelper();
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		customerList = customerDataHelper.getMockedUpCustomerData();

		if (null != customerList && customerList.size() > 0) {
			Iterator<Customer> iter = customerList.iterator();
			while (iter.hasNext()) {
				Customer customer = iter.next();
				if (customer.getCustomerNumber().equalsIgnoreCase(customerId)) {
					customerIdExists = true;
					if (null != customer.getPhoneNumber() && customer.getPhoneNumber() != StringUtils.EMPTY) {
						response = response + "'" + customer.getPhoneNumber().toString() + "'";
					}
				}
			}
		} else {
			response = "Failure : Unable to process requests currently";
		}

		if (response.equals(StringUtils.EMPTY) && customerIdExists.equals(false)) {
			response = "Failure : Invalid Customer Id";
		}

		return response;
	}

	@RequestMapping(value = "/activatePhoneNumber", method = RequestMethod.POST, produces = { "application/json" })
	public String activatePhoneNumber(@RequestParam String customerId, @RequestParam String phoneNumber) {

		String response = StringUtils.EMPTY;
		CustomerDataHelper customerDataHelper = new CustomerDataHelper();
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		customerList = customerDataHelper.getMockedUpCustomerData();

		if (null != customerList && customerList.size() > 0) {
			Iterator<Customer> iter = customerList.iterator();
			while (iter.hasNext()) {
				Customer customer = iter.next();
				if (customer.getCustomerNumber().equalsIgnoreCase(customerId)
						&& customer.getPhoneNumber().equalsIgnoreCase(phoneNumber)) {
					if (null != customer.getPhoneNumberStatus()
							&& customer.getPhoneNumberStatus() != StringUtils.EMPTY) {
						if (customer.getPhoneNumberStatus().equalsIgnoreCase("Inactive")) {
							// Update Database
							response = "Success : Successfully Activated";
						} else {
							response = "Failure : Phone number already active";
						}

					}
				} 
			}
			
			if(response.equals(StringUtils.EMPTY)) {
				response = "Failure : Invalid Customer Data";
			}
			
		} else {
			response = "Error : Unable to process requests currently";
		}

		return response;
	}

}
