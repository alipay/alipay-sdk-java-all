package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourcepackage.alter.createandpay response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-21 17:53:24
 */
public class AlipayCloudCloudbaseResourcepackageAlterCreateandpayResponse extends AlipayResponse {

	private static final long serialVersionUID = 4429376385481694718L;

	/** 
	 * 变配下单并支付结果
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
