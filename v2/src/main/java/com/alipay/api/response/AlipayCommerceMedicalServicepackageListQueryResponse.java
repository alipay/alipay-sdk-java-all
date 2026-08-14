package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SpecialtyDiseasePackage;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.servicepackage.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-07 16:31:36
 */
public class AlipayCommerceMedicalServicepackageListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6533323779374973678L;

	/** 
	 * null
	 */
	@ApiListField("specialty_disease_package_list")
	@ApiField("specialty_disease_package")
	private List<SpecialtyDiseasePackage> specialtyDiseasePackageList;

	public void setSpecialtyDiseasePackageList(List<SpecialtyDiseasePackage> specialtyDiseasePackageList) {
		this.specialtyDiseasePackageList = specialtyDiseasePackageList;
	}
	public List<SpecialtyDiseasePackage> getSpecialtyDiseasePackageList( ) {
		return this.specialtyDiseasePackageList;
	}

}
