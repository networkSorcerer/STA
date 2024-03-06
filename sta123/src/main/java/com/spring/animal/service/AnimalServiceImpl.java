package com.spring.animal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.animal.dao.animalDAO;
import com.spring.animal.vo.AnimalVO;
import com.spring.client.board.vo.BoardVO;

import lombok.Setter;

@Service
public class AnimalServiceImpl implements AnimalService{
	@Setter(onMethod_=@Autowired)
	private animalDAO animalDAO;
	
	
	//글 목록 구현 
	@Override
	public List<AnimalVO> animalList(AnimalVO avo) {
		List<AnimalVO> list = null;
		list = animalDAO.animalList(avo);
		return list;
	}
	
	@Override
	public int animalListCnt(AnimalVO bvo) {
		// TODO Auto-generated method stub
		return 0;
	}
}
