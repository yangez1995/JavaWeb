package com.ucs.factory;

import com.ucs.model.OrdinaryUser;

public class OrdinaryUserFactory {
	public static OrdinaryUser produce() {
		return new OrdinaryUser();
	}
	
	public static OrdinaryUser produce(String username, String password) {
		return new OrdinaryUser(username, password);
	}
}
