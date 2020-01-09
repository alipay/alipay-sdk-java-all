package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.vehicleowner.campaignaudit.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-12-25 16:59:56
 */
public class AlipayCommerceTransportVehicleownerCampaignauditQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8141554181437554175L;

	/** 
	 * 状态
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
