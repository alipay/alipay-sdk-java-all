package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.technician.delete response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-05 18:12:43
 */
public class AlipayCommerceLifeserviceTechnicianDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 1153865237752551993L;

	/** 
	 * 手艺人id
	 */
	@ApiField("technician_id")
	private String technicianId;

	public void setTechnicianId(String technicianId) {
		this.technicianId = technicianId;
	}
	public String getTechnicianId( ) {
		return this.technicianId;
	}

}
