package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourcepackage.itempackage.createandpay response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-20 11:37:02
 */
public class AlipayCloudCloudbaseResourcepackageItempackageCreateandpayResponse extends AlipayResponse {

	private static final long serialVersionUID = 5678677671552857355L;

	/** 
	 * 单项资源包下单并支付结果
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
