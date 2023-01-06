package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.vehicleowner.campaign.offline response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 13:55:34
 */
public class AlipayCommerceTransportVehicleownerCampaignOfflineResponse extends AlipayResponse {

	private static final long serialVersionUID = 4245563777211174295L;

	/** 
	 * 状态。P(审核中)、S(审核通过)、F(审核驳回)、I(初始状态)
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
