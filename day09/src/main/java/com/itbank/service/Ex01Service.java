package com.itbank.service;

import org.springframework.stereotype.Service;

import com.itbank.utils.Exp;


@Service
public class Ex01Service {

	// 0으로 나누었을 때의 예외가 발생하면, 직접 처리하지않고, Caller에게 예외처리를 전가시킨다
	// 1) 예외 발생 유형과 원인을 파악해야 한다
	// 2) 컨트롤러 하위의 스프링빈에서는 예외를 전가시켜서 컨트롤러까지 도달시킨다
	
	public int calc(int n1, String operator, int n2) throws ArithmeticException {
		int answer = 0;
//		if(operator.equals("+")) {
//			answer = n1 + n2;
//		}else if(operator.equals("-")) {
//			answer = n1 - n2;
//		}else if(operator.equals("*")) {
//			answer = n1 * n2;
//		}else if(operator.equals("/")){
//			answer = n1/n2;
//		}
		Exp oper = Exp.valueOf(operator);
		answer = oper.getAnswer(n1, n2);

		System.out.println(Exp.PLUS);
		System.out.println(Exp.MINUS);
		System.out.println(Exp.MULTI);
		System.out.println(Exp.DIVIDE);
		return answer;
	}
}
