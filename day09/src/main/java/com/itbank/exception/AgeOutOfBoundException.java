package com.itbank.exception;

public class AgeOutOfBoundException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private int num;
	
	public AgeOutOfBoundException(int num) {
		this.num = num;
	}
	
	
	@Override	
	public String getMessage() {
		return "나이의 값이 범위를 초과합니다 (0 ~100) :" + num;
	}
}
