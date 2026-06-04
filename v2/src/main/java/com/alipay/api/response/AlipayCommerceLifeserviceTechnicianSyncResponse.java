package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.technician.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-08 14:42:45
 */
public class AlipayCommerceLifeserviceTechnicianSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5297611438624454352L;

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
