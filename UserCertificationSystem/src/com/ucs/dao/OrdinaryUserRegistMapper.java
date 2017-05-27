package com.ucs.dao;

import org.apache.ibatis.annotations.Param;

import com.ucs.model.OrdinaryUser;

public interface OrdinaryUserRegistMapper {
	int userRegist(OrdinaryUser user);
	int checkUsernameRepeat(@Param("username")String username);
}
