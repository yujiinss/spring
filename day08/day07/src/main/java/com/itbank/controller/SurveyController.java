package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.ReplyDTO;
import com.itbank.model.SurveyDTO;
import com.itbank.service.ReplyService;
import com.itbank.service.SurveyService;

@Controller
@RequestMapping("/survey")
public class SurveyController {

	@Autowired SurveyService surveyService;
	@Autowired private ReplyService replyService;
	// 설문리스트
	@GetMapping("/list")
	public ModelAndView getSurveyList() {
		ModelAndView mav = new ModelAndView();
		List<SurveyDTO> list = surveyService.getSurveyList();
		mav.addObject("list", list);
		return mav;
	}
	
	// 설문 등록
	@GetMapping("/write")
	public void write() {}
	
	@PostMapping("/write")
	public String write(SurveyDTO dto) {
		int row = surveyService.write(dto);
		System.out.println(row != 0 ? "작성 성공" : "작성 실패");
		
		return "redirect:/survey/list";	
	}
	
	// 설문보기
	@GetMapping("/view/{idx}")
	public ModelAndView selectOne(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("/survey/view");
		SurveyDTO dto = surveyService.view(idx);
		mav.addObject("dto", dto);
		ReplyDTO dto1 = replyService.getResultList(idx);
		mav.addObject("dto1", dto1);
		ReplyDTO dto2 = replyService.getRatio(idx);
		mav.addObject("dto2", dto2);
		return mav;
	}
	
	// 설문결과
	@PostMapping("/view/{idx}")
	public String res(@PathVariable("idx") int idx, ReplyDTO dto) {	
	int row = replyService.add(dto);
	System.out.println(row != 0 ? "투표 성공" : "투표 실패");
	return "redirect:/survey/view/{idx}";
	
	}
	
	
}
