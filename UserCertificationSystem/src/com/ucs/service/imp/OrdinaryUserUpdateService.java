package com.ucs.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ucs.dao.OrdinaryUserUpdateMapper;
import com.ucs.model.OrdinaryUser;
import com.ucs.service.IOrdinaryUserUpdateService;
import com.ucs.util.MD5Util;

@Service
public class OrdinaryUserUpdateService implements IOrdinaryUserUpdateService {
	@Autowired
	private OrdinaryUserUpdateMapper ordinaryUserUpdateMapper;

	@Override
	public void updateUsername(int id, String username) {
		ordinaryUserUpdateMapper.updateUsername(id, username);
	}

	@Override
	public void updatePassword(int id, String password, String salt) {
		password = MD5Util.getMD5code(password, salt);
		ordinaryUserUpdateMapper.updatePassword(id, password, salt);
	}

	@Override
	public void updateNickname(int id, String nickname) {
		ordinaryUserUpdateMapper.updateNickname(id, nickname);
	}

	@Override
	public void updateState(int id, int state) {
		ordinaryUserUpdateMapper.updateState(id, state);
	}

	@Override
	public void updateAll(OrdinaryUser user) {
		ordinaryUserUpdateMapper.updateAll(user);
	}

}
