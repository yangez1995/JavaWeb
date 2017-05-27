package com.ucs.dao;

import org.apache.ibatis.annotations.Param;

public interface OrdinaryUserMessageInsertMapper {
	void newUser(@Param("id")int id,@Param("phoneNumber")String phoneNumber,@Param("email")String email);
}
