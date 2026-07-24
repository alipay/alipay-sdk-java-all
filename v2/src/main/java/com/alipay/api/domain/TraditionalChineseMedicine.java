package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 中医
 *
 * @author auto create
 * @since 1.0, 2026-07-17 16:32:52
 */
public class TraditionalChineseMedicine extends AlipayObject {

	private static final long serialVersionUID = 4362489156977988313L;

	/**
	 * null
	 */
	@ApiListField("medication_information_list")
	@ApiField("medication_information")
	private List<MedicationInformation> medicationInformationList;

	/**
	 * 用药医嘱
	 */
	@ApiField("medication_order")
	private String medicationOrder;

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

	public String getMedicationOrder() {
		return this.medicationOrder;
	}
	public void setMedicationOrder(String medicationOrder) {
		this.medicationOrder = medicationOrder;
	}

	public String getUsage() {
		return this.usage;
	}
	public void setUsage(String usage) {
		this.usage = usage;
	}

}
