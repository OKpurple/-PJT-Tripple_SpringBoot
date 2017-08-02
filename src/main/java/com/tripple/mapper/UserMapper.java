package com.tripple.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.tripple.domain.UserVO;

public interface UserMapper {

	 @Select("select * from users")
	  public List<UserVO> selectAll() throws Exception;

}
