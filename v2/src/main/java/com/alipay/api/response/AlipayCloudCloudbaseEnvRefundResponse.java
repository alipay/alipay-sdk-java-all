package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.env.refund response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-11 14:02:17
 */
public class AlipayCloudCloudbaseEnvRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 4585127869281833123L;

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
