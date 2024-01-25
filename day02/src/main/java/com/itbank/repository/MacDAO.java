package com.itbank.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.itbank.mac.MacDTO;


@Repository
public interface MacDAO {

	@Select("select * from mcdonald order by idx")
	List<MacDTO> selectList();

	
	@Select("select * from mcdonald where idx = #{idx}")
	MacDTO selectOne(int idx);
	
	
	@Insert("insert into mcdonald (category, name, price, imgname, memo)"
			+ " values (#{category}, #{name}, #{price}, #{imgname}, #{memo})")
	int insert(MacDTO dto);


	@Delete("delete from mcdonald where idx = #{idx}")
	int delete(int idx);



	@Update("update mcdonald"
			+ " set"
			+ "   name= #{name},"
			+ "	  price= #{price},"
			+ "   imgname= #{imgname},"
			+ "   category= #{category},"
			+ "   memo= #{memo}"
			+ " where"
			+ "   idx= #{idx}")
		int modify(MacDTO dto);
	

}
