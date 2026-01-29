package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 诊断内容
 *
 * @author auto create
 * @since 1.0, 2025-12-26 11:07:43
 */
public class GetInspectionDetailDiagnosisInfo extends AlipayObject {

	private static final long serialVersionUID = 3262758487171987237L;

	/**
	 * ICD诊断编码
	 */
	@ApiField("diacrisis_icd_code")
	private String diacrisisIcdCode;

	/**
	 * 诊断信息
	 */
	@ApiField("diagnosis")
	private String diagnosis;

	public String getDiacrisisIcdCode() {
		return this.diacrisisIcdCode;
	}
	public void setDiacrisisIcdCode(String diacrisisIcdCode) {
		this.diacrisisIcdCode = diacrisisIcdCode;
	}

	public String getDiagnosis() {
		return this.diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

}
