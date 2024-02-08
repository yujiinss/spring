package com.itbank.repository;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.itbank.model.MemberDTO;

@Repository
public interface MemberDAO {

	@Select("select * from member")
	public List<MemberDTO> selectList();

	@Select("select * from member where userid= #{userid} and userpw = #{userpw}")
	public MemberDTO login(MemberDTO dto);

	
	

}
