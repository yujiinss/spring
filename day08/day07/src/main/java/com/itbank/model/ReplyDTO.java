package com.itbank.model;

public class ReplyDTO {

//	REPLY_IDX   NOT NULL NUMBER        
//	RESPONSE_ID NOT NULL VARCHAR2(100) 
//	CHOICE      NOT NULL VARCHAR2(1) 
	
	private int reply_idx;
	private String response_id;
	private String choice;
	
	private int count1;
	private int count2;
	
	private int choice1_rate;
	private int choice2_rate;
	
	
	public int getChoice1_rate() {
		return choice1_rate;
	}
	public void setChoice1_rate(int choice1_rate) {
		this.choice1_rate = choice1_rate;
	}
	public int getChoice2_rate() {
		return choice2_rate;
	}
	public void setChoice2_rate(int choice2_rate) {
		this.choice2_rate = choice2_rate;
	}
	public int getCount1() {
		return count1;
	}
	public void setCount1(int count1) {
		this.count1 = count1;
	}
	public int getCount2() {
		return count2;
	}
	public void setCount2(int count2) {
		this.count2 = count2;
	}
	
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
