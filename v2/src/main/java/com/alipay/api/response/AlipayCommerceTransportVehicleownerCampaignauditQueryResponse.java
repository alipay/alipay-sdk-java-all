package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.vehicleowner.campaignaudit.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 08:27:58
 */
public class AlipayCommerceTransportVehicleownerCampaignauditQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7448634729527547223L;

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
