package com.ucs.service.imp;

import org.springframework.beans.factory.annotation.Autowired;

import com.ucs.dao.OrdinaryUserDeleteMapper;
import com.ucs.service.IOrdinaryUserDeleteService;

public class OrdinaryUserDeleteService implements IOrdinaryUserDeleteService {
	@Autowired
	private OrdinaryUserDeleteMapper ordinaryUserDeleteMapper;
	
	@Override
	public void deleteOne(int id) {
		ordinaryUserDeleteMapper.deleteOne(id);
	}

}
