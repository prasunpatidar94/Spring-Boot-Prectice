package com.pp.sun.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class AppRepository {

	@Autowired
	private EntityManager entityManager;

	@Transactional
	public List<?> npimPlainGetCategoryList(String code) {

		StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("prcNPIMPlainGetCategoryList");
		// set parameters
		storedProcedure.registerStoredProcedureParameter("ParentItemCode", String.class, ParameterMode.IN);
//		      storedProcedure.registerStoredProcedureParameter("in_round", String.class, ParameterMode.IN);
		storedProcedure.setParameter("ParentItemCode", code);
//		      storedProcedure.setParameter( "in_round",round);
		storedProcedure.executeUpdate();

		List<?> objectList = storedProcedure.getResultList();
		return objectList;

//		return @entityManager.createNamedStoredProcedureQuery("prcNPIMPlainGetCategoryList").setParameter(0, code).getResultList();
	}

}
