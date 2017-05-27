package com.ucs.dao;

import org.apache.ibatis.annotations.Param;

import com.ucs.model.OrdinaryUser;

public interface OrdinaryUserUpdateMapper {
	void updateAll(OrdinaryUser user);
	void updateUsername(@Param("id")int id, @Param("username")String username);
	void updatePassword(@Param("id")int id, @Param("password")String password, @Param("salt")String salt);
	void updateNickname(@Param("id")int id, @Param("nickname")String nickname);
	void updateState(@Param("id")int id, @Param("state")int state);
}
