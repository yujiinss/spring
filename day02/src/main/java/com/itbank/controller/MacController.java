package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.mac.MacDTO;
import com.itbank.service.MacService;

@Controller
public class MacController {
		
		@Autowired private MacService macService;
		
		// 리스트
		@GetMapping("/")
		public ModelAndView mac() {
			ModelAndView mav = new ModelAndView("mac-list");
			List<MacDTO> list = macService.getMacList();
			mav.addObject("list", list);
			return mav;	
		}
//		// 카테고리
//		@GetMapping("/mac-list/category")
//		public ModelAndView macCategory(@PathVariable("category") String category ) {
//			ModelAndView mav = new ModelAndView("mac-category");
//			List<MacDTO> list = macService.getList(category);
//			mav.addObject("category" , category);
//			return mav;
//			
//		}
		
		// view
		@GetMapping("/mac-view/{idx}")
		public ModelAndView macView(@PathVariable("idx") int idx ) {
			ModelAndView mav = new ModelAndView("mac-view");
			MacDTO dto = macService.selectOne(idx);
			mav.addObject("dto",dto);
			return mav;
		}
				
		// 추가하기
		@GetMapping("/mac-add")
		public ModelAndView macAdd() {
			ModelAndView mav = new ModelAndView("mac-add");
			return mav;
		}
		
		@PostMapping("/mac-add")
		public ModelAndView macAdd(MacDTO dto) {
			ModelAndView mav = new ModelAndView("redirect:/");
			int row = macService.insert(dto);
			System.out.println(row != 0 ? "추가 성공" : "추가 실패");
			return mav;
		}
		
		// 삭제하기
		@GetMapping("/mac-delete/{idx}")
		public ModelAndView macDelete(@PathVariable("idx")int idx) {
			ModelAndView mav = new ModelAndView("mac-delete");
			int row = macService.delete(idx);
			System.out.println(row != 0 ? " 삭제 성공" : "삭제 실패");
			return mav;
		}
		
		// 수정하기
		@GetMapping("/mac-modify/{idx}")
		public ModelAndView macModify(@PathVariable("idx") int idx) {
			ModelAndView mav = new ModelAndView("mac-modify");
			MacDTO dto = macService.selectOne(idx);
			mav.addObject("dto", dto);
			return mav;	
		}
		
		@PostMapping("/mac-modify/{idx}")
			public ModelAndView macModify(MacDTO dto) {
				ModelAndView mav = new ModelAndView("redirect:/");
				int row = macService.modify(dto);
				System.out.println(row != 0 ? "수정 성공" : "수정 실패");
				return mav;
			}
		}