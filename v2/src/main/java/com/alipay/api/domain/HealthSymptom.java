package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 健康门诊险症状
 *
 * @author auto create
 * @since 1.0, 2023-08-02 15:13:34
 */
public class HealthSymptom extends AlipayObject {

	private static final long serialVersionUID = 2438494383159346645L;

	/**
	 * 症状id
	 */
	@ApiField("symptom_id")
	private String symptomId;

	/**
	 * 症状名称
	 */
	@ApiField("symptom_name")
	private String symptomName;

	public String getSymptomId() {
		return this.symptomId;
	}
	public void setSymptomId(String symptomId) {
		this.symptomId = symptomId;
	}

	public String getSymptomName() {
		return this.symptomName;
	}
	public void setSymptomName(String symptomName) {
		this.symptomName = symptomName;
	}

}
