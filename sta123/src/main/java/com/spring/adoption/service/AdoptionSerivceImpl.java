package com.spring.adoption.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.adoption.dao.AdoptionDAO;
import com.spring.adoption.vo.AdoptionVO;

import com.spring.common.file.FileUploadUtil;

import lombok.Setter;

@Service
public class AdoptionSerivceImpl implements AdoptionService{
	@Setter(onMethod_=@Autowired)
	private AdoptionDAO adoptionDAO;
	
	
	//글 목록 구현 
	@Override
	public List<AdoptionVO> adoptionList(AdoptionVO adoptionvo) {
		List<AdoptionVO> list = null;
		list = adoptionDAO.adoptionList(adoptionvo);
		return list;
	}


	
	
//	@Override//통과
//	public int animalListCnt(AnimalVO bvo) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public AnimalVO animalDetail(AnimalVO avo) {
//		animalDAO.readCntUpdate(avo);
//		
//		AnimalVO detail = animalDAO.animalDetail(avo);
//		if(detail != null) {
//			detail.setAnimalMemo(detail.getAnimalMemo().replaceAll("\n", "<br/>"));
//		}
//		return detail;
//	}
//	
//	@Override
//	public int animalInsert(AnimalVO avo) throws Exception{
//		int result=0;
//		if(avo.getFile().getSize() > 0 ) {
//			String fileName = FileUploadUtil.fileUpload(avo.getFile(), "animal");
//			avo.setAnimalFile(fileName);
//		}
//		result = animalDAO.animalInsert(avo);
//		return result;
//	}
//	
//	
//	//수정 폼 구현
//		@Override
//		public AnimalVO updateForm(AnimalVO avo) {
//			AnimalVO updateData = null;
//			updateData = animalDAO.animalDetail(avo);
//			return updateData;
//		}
//		
//		//게시글 수정 구현 
//		@Override
//		public int animalUpdate(AnimalVO avo) throws Exception{
//			int result = 0;
//			if(!avo.getFile().isEmpty()) {
//				if(!avo.getAnimalFile().isEmpty()) {
//					FileUploadUtil.fileDelete(avo.getAnimalFile());
//				}
//				String fileName = FileUploadUtil.fileUpload(avo.getFile(),"animal");
//				avo.setAnimalFile(fileName);
//			}
//			result = animalDAO.animalUpdate(avo);
//			return result;
//		}
//		
//		//비밀번호 확인 구현 
//		@Override
//		public int pwdConfirm(AnimalVO avo) {
//			int result = 0;
//			result = animalDAO.pwdConfirm(avo);
//			return result;
//		}
//
//		@Override
//		public int animalDelete(AnimalVO avo) throws Exception {
//			int result = 0;
//			if(!avo.getAnimalFile().isEmpty()) {
//				FileUploadUtil.fileDelete(avo.getAnimalFile());
//			}
//			result = animalDAO.animalDelete(avo);
//			return result;
//		}

}