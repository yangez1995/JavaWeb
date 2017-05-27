package com.ucs.security;

import org.springframework.security.core.GrantedAuthority;

public class GrantedAuthorityImpl implements GrantedAuthority {
	private static final long serialVersionUID = 7598602722347133100L;
	
	private String authority;
	
	public GrantedAuthorityImpl() {}
	
	public GrantedAuthorityImpl(String authority) {
		this.authority = authority;
	}
	
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	@Override
	public String getAuthority() {
		return authority;
	}

}
