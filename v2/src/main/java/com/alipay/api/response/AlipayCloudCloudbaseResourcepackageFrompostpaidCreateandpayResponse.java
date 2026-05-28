package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourcepackage.frompostpaid.createandpay response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-21 17:53:13
 */
public class AlipayCloudCloudbaseResourcepackageFrompostpaidCreateandpayResponse extends AlipayResponse {

	private static final long serialVersionUID = 4682259785286977228L;

	/** 
	 * 按量转套餐开通下单支付结果
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
