package com.ucs.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ucs.dao.OrdinaryUserSelectMapper;
import com.ucs.factory.OrdinaryUserFactory;
import com.ucs.model.OrdinaryUser;
import com.ucs.security.GrantedAuthorityImpl;
import com.ucs.service.IAuthoritySelectService;
import com.ucs.service.IOrdinaryUserSelectService;

@Service
public class OrdinaryUserSelectService implements IOrdinaryUserSelectService{
	@Autowired
	private OrdinaryUserSelectMapper ordianryUserSelectMapper;
	@Autowired
	private IAuthoritySelectService authoritySelectService;
	
	@Override
	public int selectId(String username) {
		return ordianryUserSelectMapper.selectId(username);
	}

	@Override
	public String selectUsername(int id) {
		return ordianryUserSelectMapper.selectUsername(id);
	}

	@Override
	public String selectNickname(int id) {
		return ordianryUserSelectMapper.selectNickname(id)
				;
	}

	@Override
	public OrdinaryUser selectPassword(int id) {
		return ordianryUserSelectMapper.selectPassword(id);
	}

	@Override
	public int selectState(int id) {
		return ordianryUserSelectMapper.selectState(id);
	}

	@Override
	public OrdinaryUser selectByUsername(String username) {
		OrdinaryUser user = OrdinaryUserFactory.produce();
		user = ordianryUserSelectMapper.selectByUsername(username);
		user.setAuthorities(this.getAuthoritys(authoritySelectService.selectById(user.getRole())));
		return user;
	}

	public List<GrantedAuthorityImpl> getAuthoritys(List<String> list) {
		List<GrantedAuthorityImpl> authoritys = new ArrayList<GrantedAuthorityImpl>();
		for(String authority:list) {
			GrantedAuthorityImpl grantedAuthorityImpl = new GrantedAuthorityImpl(authority);
			authoritys.add(grantedAuthorityImpl);
		}
		return authoritys;
	}

	@Override
	public List<OrdinaryUser> getUserAccount(int startIndex, int pageSize) {
		return ordianryUserSelectMapper.getUserAccount(startIndex, pageSize);
	}

	@Override
	public int selectCount() {
		return ordianryUserSelectMapper.selectCount();
	}

	@Override
	public List<OrdinaryUser> getUserMessage(int startIndex, int pageSize) {
		return ordianryUserSelectMapper.getUserMessage(startIndex, pageSize);
	}
}
