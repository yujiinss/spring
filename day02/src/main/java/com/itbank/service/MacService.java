package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.mac.MacDTO;
import com.itbank.repository.MacDAO;

@Service
public class MacService {
	
	@Autowired private MacDAO dao;
	
	public List<MacDTO> getMacList() {

		List<MacDTO> list = dao.selectList();
		return list;
	}

	public MacDTO selectOne(int idx) {
		MacDTO dto = dao.selectOne(idx);
		return dto;
	}

	public int insert(MacDTO dto) {
		
		int row = dao.insert(dto);
		return row;
	}

	public int delete(int idx) {
		int row = dao.delete(idx);
		return row;
	}

	public int modify(MacDTO dto) {
		int row = dao.modify(dto);
		return row;
	}

//	public List<MacDTO> getList(String category) {
//		
//		return null;
//	}


	
	
}
