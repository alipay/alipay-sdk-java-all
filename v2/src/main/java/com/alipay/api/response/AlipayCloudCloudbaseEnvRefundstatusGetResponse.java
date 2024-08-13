package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.env.refundstatus.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-11 14:07:04
 */
public class AlipayCloudCloudbaseEnvRefundstatusGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1383844428486733934L;

	/** 
	 * 环境销毁是否需要退费
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
