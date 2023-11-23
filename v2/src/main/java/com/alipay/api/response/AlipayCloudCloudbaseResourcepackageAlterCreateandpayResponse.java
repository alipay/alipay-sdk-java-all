package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourcepackage.alter.createandpay response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-18 17:36:44
 */
public class AlipayCloudCloudbaseResourcepackageAlterCreateandpayResponse extends AlipayResponse {

	private static final long serialVersionUID = 7562787745366446438L;

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
