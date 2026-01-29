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
 * @since 1.0, 2025-11-19 15:22:37
 */
public class AlipayCommerceHdfaitransferMedicationguidanceGenerateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4622382379643516252L;

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
