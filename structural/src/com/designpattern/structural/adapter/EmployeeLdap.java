package com.designpattern.structural.adapter;

public class EmployeeLdap {
	private String cn;
	private String surname;
	private String givenName;
	private String mail;
	
	public EmployeeLdap(String cn, String surname, String givenName, String mail) {
		this.cn = cn;
		this.surname = surname;
		this.givenName = givenName;
		this.mail = mail;
	}
	/**
	 * @return the cn
	 */
	public String getCn() {
		return cn;
	}
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * @return the givenName
	 */
	public String getGivenName() {
		return givenName;
	}
	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}
}
