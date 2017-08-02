package com.tripple.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.tripple.domain.RouteVO;


public interface RouteMapper {

	@Insert("INSERT INTO routes VALUES(#{route_id},#{program_id},#{explanation},#{lat},#{lng},#{title},#{img_url})")
	public void createRoute(RouteVO route);
	
	@Select("SELECT * FROM routes WHERE program_id = #{program_id}")
	public List<RouteVO> listRouteById(int program_id);
}
