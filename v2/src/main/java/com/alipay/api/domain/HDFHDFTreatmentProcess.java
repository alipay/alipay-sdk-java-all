package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 诊疗经过
 *
 * @author auto create
 * @since 1.0, 2025-11-03 15:32:13
 */
public class HDFHDFTreatmentProcess extends AlipayObject {

	private static final long serialVersionUID = 5478311599712141235L;

	/**
	 * 诊疗经过
	 */
	@ApiField("treatment_process_desc")
	private String treatmentProcessDesc;

	public String getTreatmentProcessDesc() {
		return this.treatmentProcessDesc;
	}
	public void setTreatmentProcessDesc(String treatmentProcessDesc) {
		this.treatmentProcessDesc = treatmentProcessDesc;
	}

}
