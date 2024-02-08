package com.itbank.exception;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.controller.SurveyController;

@ControllerAdvice(assignableTypes = SurveyController.class)
public class Exception {

	@ExceptionHandler(DuplicateKeyException.class)
	public ModelAndView VoteException() {
		ModelAndView mav = new ModelAndView("alert");
		String msg ="투표는 한 번만 할 수 있습니다";
		String url = "/survey/list";
		mav.addObject("url",url);
		mav.addObject("msg", msg);
		return mav;
	}
}
