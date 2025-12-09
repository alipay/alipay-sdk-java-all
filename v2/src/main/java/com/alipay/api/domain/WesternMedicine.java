package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 西医
 *
 * @author auto create
 * @since 1.0, 2025-11-26 17:22:41
 */
public class WesternMedicine extends AlipayObject {

	private static final long serialVersionUID = 4122423161221992613L;

	/**
	 * null
	 */
	@ApiListField("medication_information_list")
	@ApiField("western_medication_information")
	private List<WesternMedicationInformation> medicationInformationList;

	public List<WesternMedicationInformation> getMedicationInformationList() {
		return this.medicationInformationList;
	}
	public void setMedicationInformationList(List<WesternMedicationInformation> medicationInformationList) {
		this.medicationInformationList = medicationInformationList;
	}

}
