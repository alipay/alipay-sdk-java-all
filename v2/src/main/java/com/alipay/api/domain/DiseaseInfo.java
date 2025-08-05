package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 疾病诊断对象
 *
 * @author auto create
 * @since 1.0, 2025-03-19 13:45:06
 */
public class DiseaseInfo extends AlipayObject {

	private static final long serialVersionUID = 2546359181615173674L;

	/**
	 * 诊断icd10编码
	 */
	@ApiField("disease_code_icd_10")
	private String diseaseCodeIcd10;

	/**
	 * 诊断名称
	 */
	@ApiField("disease_name")
	private String diseaseName;

	/**
	 * 三方机构系统内部的处方编码
	 */
	@ApiField("ext_disease_code")
	private String extDiseaseCode;

	public String getDiseaseCodeIcd10() {
		return this.diseaseCodeIcd10;
	}
	public void setDiseaseCodeIcd10(String diseaseCodeIcd10) {
		this.diseaseCodeIcd10 = diseaseCodeIcd10;
	}

	public String getDiseaseName() {
		return this.diseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

	public String getExtDiseaseCode() {
		return this.extDiseaseCode;
	}
	public void setExtDiseaseCode(String extDiseaseCode) {
		this.extDiseaseCode = extDiseaseCode;
	}

}
