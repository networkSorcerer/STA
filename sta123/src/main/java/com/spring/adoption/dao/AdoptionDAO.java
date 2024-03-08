package com.spring.adoption.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.spring.adoption.vo.AdoptionVO;
import com.spring.animal.vo.AnimalVO;


@Mapper
public interface AdoptionDAO {
	public List<AdoptionVO> adoptionList(AdoptionVO adoptionvo);
	public int readCntUpdate(AnimalVO avo);
	public int adoptionListCnt(AnimalVO avo);
	//public int animalInsert(AnimalVO avo); 
	//public AnimalVO animalDetail(AnimalVO avo);
	
	//public int pwdConfirm(AnimalVO avo); 
	//public int animalUpdate(AnimalVO avo);
	//public int animalDelete(AnimalVO avo);
	
}
