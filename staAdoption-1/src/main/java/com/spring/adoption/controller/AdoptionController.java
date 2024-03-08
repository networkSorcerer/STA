package com.spring.adoption.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.adoption.service.AdoptionService;
import com.spring.adoption.vo.AdoptionVO;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/adoption/*")
@Slf4j
public class AdoptionController {
	@Setter(onMethod_=@Autowired)
	private AdoptionService adoptionService;
	
	
	
	@GetMapping("/adoptionList")
	public String adoptionList(@ModelAttribute AdoptionVO adoptionvo, Model model) {
		log.info("animalList 호출 성공");
		
		List<AdoptionVO> adoptionList = adoptionService.adoptionList(adoptionvo);
		model.addAttribute("adoptionList", adoptionList);
		return "project/adoption/adoptionList";
	}
	
	
}