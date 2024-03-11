package com.spring.adoption.vo;

import org.springframework.web.multipart.MultipartFile;

import com.spring.animal.vo.AnimalVO;
import com.spring.common.vo.CommonVO;
import com.spring.map.vo.MapVO;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class AdoptionVO extends CommonVO{
	private int adoptionId=0;
	private String adoptionContent="";
	private String adoptionDate;
	private String adoptionTitle="";
	private int adoptionCnt=0;
	private String adoptionStatus="";
	private String adoptionLevel="";
	private String adoptionPasswd="";
	
	private AnimalVO animalId;
	private AnimalVO animalFile;
	private AnimalVO readcnt;
	private AnimalVO animalRegist;
	private AnimalVO animalName;
	private AnimalVO animalSpecies;
	private AnimalVO animalGender;
	private AnimalVO animalKg;
	private AnimalVO animalAge;
	private AnimalVO animalColor;
	private AnimalVO animalStatus;
	private AnimalVO animalMemo;
	private AnimalVO animalTemp;
	
	private MapVO centerId;
	private MapVO centerName;
	private MapVO centerAddress;
	private MapVO centerOperating;
	private MapVO centerTell;
	private MapVO centerLat;
	private MapVO centerLot;
	
	private MultipartFile file;
	private String adoptionFile = "";
}