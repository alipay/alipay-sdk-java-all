package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourcepackage.alter.createandpay response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-20 14:22:01
 */
public class AlipayCloudCloudbaseResourcepackageAlterCreateandpayResponse extends AlipayResponse {

	private static final long serialVersionUID = 1334345371834378645L;

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
