package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 疾病数据
 *
 * @author auto create
 * @since 1.0, 2022-06-20 14:30:48
 */
public class DiseaseData extends AlipayObject {

	private static final long serialVersionUID = 2835313748813617289L;

	/**
	 * 疾病id
	 */
	@ApiField("disease_id")
	private String diseaseId;

	/**
	 * 疾病名称
	 */
	@ApiField("disease_name")
	private String diseaseName;

	public String getDiseaseId() {
		return this.diseaseId;
	}
	public void setDiseaseId(String diseaseId) {
		this.diseaseId = diseaseId;
	}

	public String getDiseaseName() {
		return this.diseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

}
