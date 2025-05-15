package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourcepackage.frompostpaid.createandpay response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-24 16:12:21
 */
public class AlipayCloudCloudbaseResourcepackageFrompostpaidCreateandpayResponse extends AlipayResponse {

	private static final long serialVersionUID = 3357889778745364157L;

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
