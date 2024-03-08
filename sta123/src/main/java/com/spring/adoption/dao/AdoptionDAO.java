package com.spring.adoption.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.spring.adoption.vo.AdoptionVO;


@Mapper
public interface AdoptionDAO {
	public List<AdoptionVO> adoptionList(AdoptionVO adoptionvo);
	
}
