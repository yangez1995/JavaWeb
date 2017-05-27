package com.ucs.dao;

import org.apache.ibatis.annotations.Param;

import com.ucs.model.OrdinaryUser;

public interface OrdinaryUserLoginMapper {
	OrdinaryUser userLoginUseUsername(@Param("username")String username);
	OrdinaryUser userLoginUseId(@Param("id")int id);
}
