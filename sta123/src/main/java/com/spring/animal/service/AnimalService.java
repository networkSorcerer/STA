package com.spring.animal.service;

import java.util.List;

import com.spring.animal.vo.AnimalVO;


public interface AnimalService {
	public List<AnimalVO> animalList(AnimalVO avo);
	
	
	public int animalListCnt(AnimalVO avo);
	public int animalInsert(AnimalVO avo); 
	public AnimalVO animalDetail(AnimalVO avo); 
	
	public int pwdConfirm(AnimalVO avo);
	public AnimalVO updateForm(AnimalVO bvo);
	public int animalUpdate(AnimalVO avo); 
	public int animalDelete(AnimalVO avo); 
	
	//board테이블의 전체 레코드 수
}
