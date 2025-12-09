package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.technicianstock.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-03 10:32:41
 */
public class AlipayCommerceMerchantcardTechnicianstockSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4267495894926662184L;

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
