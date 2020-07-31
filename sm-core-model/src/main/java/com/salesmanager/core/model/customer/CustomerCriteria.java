package com.salesmanager.core.model.customer;

import com.salesmanager.core.model.common.Criteria;

public class CustomerCriteria extends Criteria {

	private String firstName;
	private String lastName;
	private String name;
	private String email;
	private String country;
	private String cpfString;

	public String getFirstName() {
		return firstName;
	}

	public String getCpfString() {
		return cpfString;
	}

	public void setCpfString(String cpfString) {
		this.cpfString = cpfString;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}
	public String getName() {
		return name;
	}
	public void setName(final String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(final String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(final String country) {
		this.country = country;
	}

}
