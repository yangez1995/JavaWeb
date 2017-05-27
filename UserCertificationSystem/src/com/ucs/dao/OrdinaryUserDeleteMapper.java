package com.ucs.dao;

import org.apache.ibatis.annotations.Param;

public interface OrdinaryUserDeleteMapper {
	void deleteOne(@Param("id")int id);
}
