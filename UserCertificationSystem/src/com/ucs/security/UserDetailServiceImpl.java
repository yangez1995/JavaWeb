package com.ucs.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.ucs.factory.OrdinaryUserFactory;
import com.ucs.model.OrdinaryUser;
import com.ucs.service.imp.OrdinaryUserSelectService;

public class UserDetailServiceImpl implements UserDetailsService {

	@Autowired
	private OrdinaryUserSelectService ordinaryUserSelectService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		OrdinaryUser user = OrdinaryUserFactory.produce();
		try {
			user = ordinaryUserSelectService.selectByUsername(username);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

}
