package com.ucs.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ucs.dao.OrdinaryUserMessageInsertMapper;
import com.ucs.service.IOrdinaryUserMessageInsertService;

@Service
public class OrdinaryUserMessageInsertService implements IOrdinaryUserMessageInsertService {
	@Autowired
	private OrdinaryUserMessageInsertMapper ordinaryUserMessageInsertMapper;
	
	@Override
	public void newUser(int id, String phoneNumber, String email) {
		ordinaryUserMessageInsertMapper.newUser(id, phoneNumber, email);
	}

}
