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
 * @since 1.0, 2026-04-30 14:12:45
 */
public class AlipayCommerceMedicalServicepackageListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1261187364768739766L;

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
