package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.vehicleowner.campaign.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:56:35
 */
public class AlipayCommerceTransportVehicleownerCampaignModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3235353663337677435L;

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
