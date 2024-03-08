package com.spring.adoption.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.adoption.dao.AdoptionDAO;
import com.spring.adoption.vo.AdoptionVO;



import lombok.Setter;

@Service
public class AdoptionServiceImpl implements AdoptionService{
	
	@Setter(onMethod_=@Autowired)
	private AdoptionDAO adoptionDAO;
	
	
	//글 목록 구현 
	@Override
	public List<AdoptionVO> adoptionList(AdoptionVO adoptionvo) {
		List<AdoptionVO> list = null;
		list = adoptionDAO.adoptionList(adoptionvo);
		return list;
	}


	
	
	@Override//통과
	public int adoptionListCnt(AdoptionVO adoptionvo) {
		
		return adoptionDAO.adoptionListCnt(adoptionvo);
	}

	@Override
	public AdoptionVO adoptionDetail(AdoptionVO adoptionvo) {
		adoptionDAO.readCntUpdate(adoptionvo);
		
		AdoptionVO detail = adoptionDAO.adoptionDetail(adoptionvo);
		if(detail != null) {
			detail.setAdoptionContent(detail.getAdoptionContent().replaceAll("\n", "<br/>"));
		}
		return detail;
	}
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