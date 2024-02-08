package com.itbank.model;

public class ReplyDTO {

//	REPLY_IDX   NOT NULL NUMBER        
//	RESPONSE_ID NOT NULL VARCHAR2(100) 
//	CHOICE      NOT NULL VARCHAR2(1) 
	
	private int reply_idx;
	private String response_id;
	private String choice;
	
	public int getReply_idx() {
		return reply_idx;
	}
	public void setReply_idx(int reply_idx) {
		this.reply_idx = reply_idx;
	}
	public String getResponse_id() {
		return response_id;
	}
	public void setResponse_id(String response_id) {
		this.response_id = response_id;
	}
	public String getChoice() {
		return choice;
	}
	public void setChoice(String choice) {
		this.choice = choice;
	}
	
	
}
