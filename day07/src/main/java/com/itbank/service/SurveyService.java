package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.SurveyDTO;
import com.itbank.repository.SurveyDAO;

@Service
public class SurveyService {

	@Autowired SurveyDAO dao;

	public List<SurveyDTO> getSurveyList() {
		List<SurveyDTO> list = dao.SurveyList();
		return list;
	}
	
	public int write(SurveyDTO dto) {
		dto.setImage1(dto.getUpload1().getOriginalFilename());
		dto.setImage2(dto.getUpload2().getOriginalFilename());
		return dao.insert(dto);
	}

	public SurveyDTO getSurvey(int idx) {
		return dao.selectOne(idx);
	}


}
