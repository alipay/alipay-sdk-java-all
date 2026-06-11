package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.technicianstock.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-16 17:37:44
 */
public class AlipayCommerceLifeserviceTechnicianstockSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4344161644636247622L;

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
