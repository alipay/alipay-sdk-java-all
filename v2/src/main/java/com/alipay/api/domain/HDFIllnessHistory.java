package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 重大疾病史
 *
 * @author auto create
 * @since 1.0, 2025-11-03 15:32:13
 */
public class HDFIllnessHistory extends AlipayObject {

	private static final long serialVersionUID = 5513854357146849334L;

	/**
	 * 既往病史描述
	 */
	@ApiField("medical_history_desc")
	private String medicalHistoryDesc;

	/**
	 * 1（手术）/2（重大疾病）/8（放化疗）/9 （甲状腺或肾上腺疾病史）
	 */
	@ApiField("medical_history_type")
	private String medicalHistoryType;

	public String getMedicalHistoryDesc() {
		return this.medicalHistoryDesc;
	}
	public void setMedicalHistoryDesc(String medicalHistoryDesc) {
		this.medicalHistoryDesc = medicalHistoryDesc;
	}

	public String getMedicalHistoryType() {
		return this.medicalHistoryType;
	}
	public void setMedicalHistoryType(String medicalHistoryType) {
		this.medicalHistoryType = medicalHistoryType;
	}

}
