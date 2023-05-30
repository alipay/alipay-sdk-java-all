package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.cloud.app.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 15:06:47
 */
public class AlipayOpenCloudAppQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1383849333164573953L;

	/** 
	 * 云调用状态
	 */
	@ApiField("cloud_call_status")
	private String cloudCallStatus;

	public void setCloudCallStatus(String cloudCallStatus) {
		this.cloudCallStatus = cloudCallStatus;
	}
	public String getCloudCallStatus( ) {
		return this.cloudCallStatus;
	}

}
