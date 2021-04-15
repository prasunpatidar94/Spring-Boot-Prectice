package com.pp.sun.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.sun.repo.AppRepository;

@Service
public class Services {
	
	@Autowired
	private AppRepository appRepository;

	public List<?> callProc(String code) {
		
		List<?> list = appRepository.npimPlainGetCategoryList(code);

		
		return list;
	}
	
	
	
	

}
