package com.spring.animal.service;

import java.util.List;

import com.spring.animal.vo.AnimalVO;

public interface AnimalService {
	public List<AnimalVO> animalList(AnimalVO avo);
	
	public int readCntUpdate(AnimalVO avo); 
	public int animalListCnt(AnimalVO avo);
	//public int boardInsert(AnimalVO avo); 
	//public AnimalVO boardDetail(AnimalVO avo); 
	
	//public int pwdConfirm(AnimalVO avo); 
	//public int boardUpdate(AnimalVO avo); 
	//public int boardDelete(AnimalVO avo); 
	
	//board테이블의 전체 레코드 수
}
