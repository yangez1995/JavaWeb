package com.ucs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ucs.model.OrdinaryUser;

public interface OrdinaryUserSelectMapper {
	OrdinaryUser selectByUsername(@Param("username")String username);
	int selectCount();
	List<OrdinaryUser> getUserAccount(@Param("startIndex")int startIndex,@Param("pageSize")int pageSize);
	List<OrdinaryUser> getUserMessage(@Param("startIndex")int startIndex,@Param("pageSize")int pageSize);
	int selectId(@Param("username")String username);
	String selectUsername(@Param("id")int id);
	String selectNickname(@Param("id")int id);
	OrdinaryUser selectPassword(@Param("id")int id);
	int selectState(@Param("id")int id);
}
