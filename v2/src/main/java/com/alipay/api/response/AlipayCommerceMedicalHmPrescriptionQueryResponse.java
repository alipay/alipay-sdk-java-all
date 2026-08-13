package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PrescriptionInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hm.prescription.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-28 19:07:34
 */
public class AlipayCommerceMedicalHmPrescriptionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5681377636594954869L;

	/** 
	 * null
	 */
	@ApiListField("prescription_infos")
	@ApiField("prescription_info")
	private List<PrescriptionInfo> prescriptionInfos;

	public void setPrescriptionInfos(List<PrescriptionInfo> prescriptionInfos) {
		this.prescriptionInfos = prescriptionInfos;
	}
	public List<PrescriptionInfo> getPrescriptionInfos( ) {
		return this.prescriptionInfos;
	}

}
