package com.itbank.test1;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	// 스프링의 컨트롤러는 자바서블릿과 달리, 상속을 사용하지 않기 때문에
	// 보다 자유롭게 함수의 형식을 지정할 수 있다
	
	
	@RequestMapping("/")
	public String home(HttpServletRequest request ) {
		request.setAttribute("msg", "Hello,Spring !!");
		return "home";
	}
	
	// 멤버필드를 따로 빼둔 이유는 다른 함수에서도 사용할 수 있게하기 위해
	int n1;
	int n2;
	
	
	@GetMapping("/ex01")
	public String ex01(Model model) {
		Random ran = new Random();
		n1 = ran.nextInt(10)+1;
		n2 = ran.nextInt(10)+1;
		model.addAttribute("n1", n1); // request.setAttribute()와 동일하다
		model.addAttribute("n2", n2); // request에는 너무 많은 정보가 포함되어 있다
		return "ex01";
	}
	
	@PostMapping("/ex01")
	public String ex01(int input, Model model) {	// 자바 빈즈 규약을 만족하는 DTO도 처리가능(useBean + setProperty)	
		// 파라미터는 매개변수에 넣으면 알아서 형변환까지 처리해준다
		// System.out.println(n1+n2 == input);
		String exp = String.format("%d + %d = %d",n1,n2, input);
		String color = n1 + n2 == input ? "blue" : "red";
		model.addAttribute("exp", exp);
		model.addAttribute("color", color);
		return "ex01-result";
	}
}
