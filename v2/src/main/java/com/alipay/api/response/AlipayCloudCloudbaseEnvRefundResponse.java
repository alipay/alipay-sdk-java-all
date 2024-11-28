package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.env.refund response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-20 16:54:50
 */
public class AlipayCloudCloudbaseEnvRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 5895815252337667192L;

	/** 
	 * 销毁并退费操作结果
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
