package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.vehicleowner.campaign.offline response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-27 12:17:39
 */
public class AlipayCommerceTransportVehicleownerCampaignOfflineResponse extends AlipayResponse {

	private static final long serialVersionUID = 6743995677593464858L;

	/** 
	 * 业务扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 状态
	 */
	@ApiField("status")
	private String status;

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
