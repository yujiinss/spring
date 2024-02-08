package com.itbank.service;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.SurveyDTO;
import com.itbank.repository.SurveyDAO;

@Service
public class SurveyService {

	@Autowired SurveyDAO dao;
	private String saveDirectory = "C:\\upload";
	
	public SurveyService() {
		File dir = new File(saveDirectory);
		if(dir.exists() == false) {
			dir.mkdirs();
		}
	}
	// 리스트
	public List<SurveyDTO> getSurveyList() {
		return dao.selectList();
	}
	// 설문 작성
	public int write(SurveyDTO dto) {
		String image1 = dto.getUpload1().getOriginalFilename();
		String image2 = dto.getUpload2().getOriginalFilename();
		
		File f1 = new File(saveDirectory, image1);
		File f2 = new File(saveDirectory, image2);
		
		try {
			dto.getUpload1().transferTo(f1);
			dto.getUpload2().transferTo(f2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		dto.setImage1(image1);
		dto.setImage2(image2);
		
		return dao.write(dto);
	}
	// 설문하나 보기
	public SurveyDTO view(int idx) {
		return dao.view(idx);
	}

}
