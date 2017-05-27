package com.ucs.model;

import com.ucs.model.intfc.UserMessage;

public class OrdinaryUserMessage implements UserMessage {
	private String email;
	private String phoneNumber;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
