package com.spring.animal.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.spring.animal.vo.AnimalVO;


@Mapper
public interface animalDAO {
	public List<AnimalVO> animalList(AnimalVO avo);
	/*
	 * public int boardInsert(AnimalVO avo); public AnimalVO boardDetail(AnimalVO
	 * avo); public int readCntUpdate(AnimalVO avo); public int pwdConfirm(AnimalVO
	 * avo); public int boardUpdate(AnimalVO avo); public int boardDelete(AnimalVO
	 * avo); public int boardListCnt(AnimalVO avo);
	 */ //board테이블의 전체 레코드 수
}
