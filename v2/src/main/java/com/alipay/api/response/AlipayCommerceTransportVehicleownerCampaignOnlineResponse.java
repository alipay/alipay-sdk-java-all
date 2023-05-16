package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.vehicleowner.campaign.online response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 06:25:49
 */
public class AlipayCommerceTransportVehicleownerCampaignOnlineResponse extends AlipayResponse {

	private static final long serialVersionUID = 7299628881234333341L;

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
