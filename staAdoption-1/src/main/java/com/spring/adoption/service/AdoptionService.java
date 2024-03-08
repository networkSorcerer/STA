package com.spring.adoption.service;

import java.util.List;

import com.spring.adoption.vo.AdoptionVO;

public interface AdoptionService {
	public List<AdoptionVO> adoptionList(AdoptionVO adoptionvo);
	
	public int adoptionListCnt(AdoptionVO avo);
	public AdoptionVO adoptionDetail(AdoptionVO avo); 
//	public int pwdConfirm(AdoptionVO avo);
//	public AdoptionVO updateForm(AdoptionVO bvo);
//	
//	
//	
//	public int adoptionInsert(AdoptionVO avo) throws Exception;
//	public int adoptionUpdate(AdoptionVO avo) throws Exception; 
//	public int adoptionDelete(AdoptionVO avo) throws Exception; 

}