package com.ucs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ucs.security.GrantedAuthorityImpl;

public interface AuthoritySelectMapper {
	List<String> selectById(@Param("role")String role);
}
