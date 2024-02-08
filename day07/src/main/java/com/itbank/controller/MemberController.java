package com.itbank.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.MemberDTO;
import com.itbank.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired MemberService memberService;
	
	
	@GetMapping("/list")
	public ModelAndView memberList() {
		ModelAndView mav = new ModelAndView();
		List<MemberDTO> list = memberService.getMemberList();
		mav.addObject("list",list);
		return mav;
	}
	
	@GetMapping("/login")
	public void login() {}

	@PostMapping("/login")
	public String login(MemberDTO dto, String url, HttpSession session) {
		MemberDTO login = memberService.login(dto);
		session.setAttribute("login", login);
		if(url == null) {
			url = "/";
		}
		return "redirect:" + url;
	}

	
}
