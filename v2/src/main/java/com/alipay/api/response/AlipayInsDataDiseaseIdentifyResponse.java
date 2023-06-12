package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.data.disease.identify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 23:12:56
 */
public class AlipayInsDataDiseaseIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5343192813833664558L;

	/** 
	 * 疾病标准编码
	 */
	@ApiField("disease_code")
	private String diseaseCode;

	/** 
	 * 疾病标准名称
	 */
	@ApiField("disease_name")
	private String diseaseName;

	/** 
	 * 疾病标签
	 */
	@ApiField("disease_tag")
	private String diseaseTag;

	public void setDiseaseCode(String diseaseCode) {
		this.diseaseCode = diseaseCode;
	}
	public String getDiseaseCode( ) {
		return this.diseaseCode;
	}

	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}
	public String getDiseaseName( ) {
		return this.diseaseName;
	}

	public void setDiseaseTag(String diseaseTag) {
		this.diseaseTag = diseaseTag;
	}
	public String getDiseaseTag( ) {
		return this.diseaseTag;
	}

}
