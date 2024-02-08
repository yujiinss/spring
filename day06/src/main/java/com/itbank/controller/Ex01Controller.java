package com.itbank.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ex01")
public class Ex01Controller {
	
	public Ex01Controller() {
		File dir = new File("C:\\upload");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
	}

	@GetMapping
	public void ex01() {}
	
	// 어떤 데이트를 JSP페이지로 보내려면 ModelAndView
	// 데이터를 보내지 않으면 String 혹은 void
	
	@PostMapping
	public ModelAndView ex01(MultipartRequest mpRequest) throws IllegalStateException, IOException {
		// 리다이렉트 할때 mav에 addObject를 수행하면 쿼리스트링 형태로 만들어진다
		ModelAndView mav = new ModelAndView("redirect:/ex01");
		MultipartFile upload = mpRequest.getFile("upload");
		
		mav.addObject("originalFileName", upload.getOriginalFilename());
		mav.addObject("size", upload.getSize());
		
		File f = new File("C:\\upload", upload.getOriginalFilename());
		upload.transferTo(f);
		return mav;
	}
}
