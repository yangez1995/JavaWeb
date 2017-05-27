package com.ucs.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ucs.dao.OrdinaryUserRegistMapper;
import com.ucs.model.OrdinaryUser;
import com.ucs.service.IOrdinaryUserRegistService;

@Service
public class OrdinaryUserRegistService implements IOrdinaryUserRegistService {

	@Autowired
	private OrdinaryUserRegistMapper ordinaryUserRegistMapper;
	
	@Override
	public int userRegist(OrdinaryUser user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		user.setState(0);
		user.setRole("4");
		user.setNickname("ÃÈÐÂ");
		user.setPassword(encoder.encode(user.getPassword()));
		return ordinaryUserRegistMapper.userRegist(user);
	}

	@Override
	public int checkUsernameRepeat(String username) {
		return ordinaryUserRegistMapper.checkUsernameRepeat(username);
	}

}
