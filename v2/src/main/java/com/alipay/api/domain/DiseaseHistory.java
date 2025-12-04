package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-11-26 17:22:41
 */
public class DiseaseHistory extends AlipayObject {

	private static final long serialVersionUID = 1665889587451674845L;

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
