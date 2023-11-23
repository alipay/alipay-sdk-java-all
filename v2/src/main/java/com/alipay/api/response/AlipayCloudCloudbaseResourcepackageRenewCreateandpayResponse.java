package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourcepackage.renew.createandpay response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-30 17:11:48
 */
public class AlipayCloudCloudbaseResourcepackageRenewCreateandpayResponse extends AlipayResponse {

	private static final long serialVersionUID = 6456522933981961999L;

	/** 
	 * 续费下单并支付结果
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
