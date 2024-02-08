package com.itbank.repository;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.itbank.model.ReplyDTO;

public interface ReplyDAO {

	@Insert("insert into reply (response_id, reply_idx, choice) "
			+ " values (#{response_id}, #{reply_idx}, #{choice})")
	int add(ReplyDTO dto);

	@Select("select * from survey1_result where idx=#{idx} and rownum=1")
	ReplyDTO ResultList(int idx);

	@Select("select * from survey_result where idx = #{idx} and rownum = 1")
	ReplyDTO ratio(int idx);
	
	

}
