package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.cloud.app.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 21:46:44
 */
public class AlipayOpenCloudAppQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5128412297117333817L;

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
