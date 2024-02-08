package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.ReplyDTO;
import com.itbank.repository.ReplyDAO;

@Service
public class ReplyService {

	@Autowired private ReplyDAO dao;
	
	public int add(ReplyDTO dto) {
		return dao.add(dto);
	}

	public ReplyDTO getResultList(int idx) {
		ReplyDTO list = dao.ResultList(idx);
		return list;
	}

	public ReplyDTO getRatio(int idx) {
		return dao.ratio(idx);
	}

}
