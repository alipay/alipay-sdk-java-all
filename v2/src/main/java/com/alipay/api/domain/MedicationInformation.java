package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-10-29 15:52:40
 */
public class MedicationInformation extends AlipayObject {

	private static final long serialVersionUID = 3886812594277221635L;

	/**
	 * 药品用量  eg：20.00（g）
	 */
	@ApiField("dosage")
	private String dosage;

	/**
	 * 药品名称
	 */
	@ApiField("medical_name")
	private String medicalName;

	public String getDosage() {
		return this.dosage;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public String getMedicalName() {
		return this.medicalName;
	}
	public void setMedicalName(String medicalName) {
		this.medicalName = medicalName;
	}

}
