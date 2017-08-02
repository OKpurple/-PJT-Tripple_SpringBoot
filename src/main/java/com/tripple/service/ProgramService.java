package com.tripple.service;

import java.util.List;
import java.util.Map;

import com.tripple.domain.ProgramVO;

public interface ProgramService {
	public void createProgram(ProgramVO program);
	public List<ProgramVO> listAll();
	public Map<String,Object> listById(int program_id);
	public List<ProgramVO> readProgramsByUid(int user_id);
}
