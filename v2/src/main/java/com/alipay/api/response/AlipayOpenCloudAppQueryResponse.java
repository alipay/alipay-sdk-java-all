package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.cloud.app.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 20:06:58
 */
public class AlipayOpenCloudAppQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8773583921231511464L;

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
