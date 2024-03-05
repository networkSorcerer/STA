package com.spring.animal.vo;

import com.spring.common.vo.CommonVO;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class AnimalVO extends CommonVO { 
	private int animalID =0;
	private String animal_species;
	private String animal_age;
	private String animal_gender;
	private String animal_status;
	private String animal_kg;
	private String animal_color;
	private String animal_memo;
	private String animal_temp;
	private String animal_regist;
	private String animal_name;
}
