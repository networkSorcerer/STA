package com.spring.animal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.animal.dao.animalDAO;
import com.spring.animal.vo.AnimalVO;

import lombok.Setter;

@Service
public class AnimalServiceImpl implements AnimalService{
	@Setter(onMethod_=@Autowired)
	private animalDAO animalDAO;
	
	@Override
	public List<AnimalVO> animalList(AnimalVO avo) {
		List<AnimalVO> list = null;
		list = animalDAO.animalList(avo);
		return list;
	}
	
}
