package com.tripple.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.tripple.domain.ProgramVO;


public interface ProgramMapper {

	@Select("select * from programs")
	public List<ProgramVO> listAll();
	
	@Select("SELECT * FROM programs WHERE user_id = #{user_id}")
	public List<ProgramVO> readProgramsByUid(int user_id);
	
	@Select("SELECT * FROM programs WHERE program_id = #{program_id}")
	public ProgramVO programById(int program_id);
	
	@Insert("insert into programs"
	+ " values(#{program_id},#{user_id},#{title},#{city},#{start_time},#{end_time},#{meeting_lng},#{meeting_lat},#{participant_max},#{content},#{img_url},#{languages},#{themes})")
	public void createProgram(ProgramVO program);
	
}
