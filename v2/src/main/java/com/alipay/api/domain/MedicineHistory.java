package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-10-29 15:52:40
 */
public class MedicineHistory extends AlipayObject {

	private static final long serialVersionUID = 4459856461499215849L;

	/**
	 * 用药结束时间
	 */
	@ApiField("medication_end_date")
	private String medicationEndDate;

	/**
	 * 用药开始时间
	 */
	@ApiField("medication_start_date")
	private String medicationStartDate;

	/**
	 * 用药频率
	 */
	@ApiField("medicine_frequency")
	private MedicineFrequency medicineFrequency;

	/**
	 * 药物名称
	 */
	@ApiField("medicine_name")
	private String medicineName;

	public String getMedicationEndDate() {
		return this.medicationEndDate;
	}
	public void setMedicationEndDate(String medicationEndDate) {
		this.medicationEndDate = medicationEndDate;
	}

	public String getMedicationStartDate() {
		return this.medicationStartDate;
	}
	public void setMedicationStartDate(String medicationStartDate) {
		this.medicationStartDate = medicationStartDate;
	}

	public MedicineFrequency getMedicineFrequency() {
		return this.medicineFrequency;
	}
	public void setMedicineFrequency(MedicineFrequency medicineFrequency) {
		this.medicineFrequency = medicineFrequency;
	}

	public String getMedicineName() {
		return this.medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

}
