package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.env.refundstatus.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-20 16:57:07
 */
public class AlipayCloudCloudbaseEnvRefundstatusGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3442751632865154928L;

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
