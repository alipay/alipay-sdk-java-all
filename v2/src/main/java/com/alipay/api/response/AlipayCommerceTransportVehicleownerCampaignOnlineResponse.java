package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.vehicleowner.campaign.online response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:56:01
 */
public class AlipayCommerceTransportVehicleownerCampaignOnlineResponse extends AlipayResponse {

	private static final long serialVersionUID = 3882937555319634197L;

	/** 
	 * 审核状态：P（审核中）、S(审核通过)、F(审核驳回)、I（初始状态）
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
