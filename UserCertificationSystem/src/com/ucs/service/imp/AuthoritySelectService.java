package com.ucs.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ucs.dao.AuthoritySelectMapper;
import com.ucs.security.GrantedAuthorityImpl;
import com.ucs.service.IAuthoritySelectService;

@Service
public class AuthoritySelectService implements IAuthoritySelectService {
	@Autowired
	private AuthoritySelectMapper authoritySelectMapper;

	@Override
	public List<String> selectById(String role) {
		return authoritySelectMapper.selectById(role);
	}
}
