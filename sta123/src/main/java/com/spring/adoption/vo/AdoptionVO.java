package com.spring.adoption.vo;

import org.springframework.web.multipart.MultipartFile;

import com.spring.animal.vo.AnimalVO;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class AdoptionVO {
	private int adoptionId=0;
	private String adoptionContent="";
	private String adoptionDate;
	private String adoptionTitle="";
	private int adoptionCnt=0;
	private String adoptionStatus="";
	private String adoptionLevel="";
	
	
	private AnimalVO animalId;
	private AnimalVO animalName;
	
	private MultipartFile file;
	private String adoptionFile = "";
}
