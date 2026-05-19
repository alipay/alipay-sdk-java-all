package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 中医
 *
 * @author auto create
 * @since 1.0, 2026-04-02 17:22:45
 */
public class TraditionalChineseMedicine extends AlipayObject {

	private static final long serialVersionUID = 3238286375553282786L;

	/**
	 * null
	 */
	@ApiListField("medication_information_list")
	@ApiField("medication_information")
	private List<MedicationInformation> medicationInformationList;

	/**
	 * 药品用法  eg：5剂 每日一剂 水煎 400ml
	 */
	@ApiField("usage")
	private String usage;

	public List<MedicationInformation> getMedicationInformationList() {
		return this.medicationInformationList;
	}
	public void setMedicationInformationList(List<MedicationInformation> medicationInformationList) {
		this.medicationInformationList = medicationInformationList;
	}

	public String getUsage() {
		return this.usage;
	}
	public void setUsage(String usage) {
		this.usage = usage;
	}

}
