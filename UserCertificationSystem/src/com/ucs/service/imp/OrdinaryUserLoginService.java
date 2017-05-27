package com.ucs.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ucs.dao.OrdinaryUserLoginMapper;
import com.ucs.model.OrdinaryUser;
import com.ucs.service.IOrdinaryUserLoginService;

@Service
public class OrdinaryUserLoginService implements IOrdinaryUserLoginService {
	@Autowired
	private OrdinaryUserLoginMapper ordinaryUserLoginMapper;

	@Override
	public OrdinaryUser userLoginUseUsername(String username) {
		return ordinaryUserLoginMapper.userLoginUseUsername(username);
	}

	@Override
	public OrdinaryUser userLoginUseId(int id) {
		return ordinaryUserLoginMapper.userLoginUseId(id);
	}


}
