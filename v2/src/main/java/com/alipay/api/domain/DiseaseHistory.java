package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-06-03 15:51:52
 */
public class DiseaseHistory extends AlipayObject {

	private static final long serialVersionUID = 2766173496866283158L;

	/**
	 * 确诊日期
	 */
	@ApiField("diagnosis_date")
	private String diagnosisDate;

	/**
	 * 疾病名称
	 */
	@ApiField("disease_name")
	private String diseaseName;

	public String getDiagnosisDate() {
		return this.diagnosisDate;
	}
	public void setDiagnosisDate(String diagnosisDate) {
		this.diagnosisDate = diagnosisDate;
	}

	public String getDiseaseName() {
		return this.diseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

}
