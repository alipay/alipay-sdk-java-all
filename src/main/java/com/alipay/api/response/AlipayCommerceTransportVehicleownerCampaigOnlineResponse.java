package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.vehicleowner.campaig.online response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-27 10:25:23
 */
public class AlipayCommerceTransportVehicleownerCampaigOnlineResponse extends AlipayResponse {

	private static final long serialVersionUID = 4287899819311416871L;

	/** 
	 * 审核状态：P（审核中）、S(审核通过)、F(失败)、I（初始状态）
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
