package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MedicationGuidanceItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.hdfaitransfer.medicationguidance.generate response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-21 21:32:40
 */
public class AlipayCommerceHdfaitransferMedicationguidanceGenerateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5722227246787976645L;

	/** 
	 * null
	 */
	@ApiListField("data")
	@ApiField("medication_guidance_item")
	private List<MedicationGuidanceItem> data;

	public void setData(List<MedicationGuidanceItem> data) {
		this.data = data;
	}
	public List<MedicationGuidanceItem> getData( ) {
		return this.data;
	}

}
