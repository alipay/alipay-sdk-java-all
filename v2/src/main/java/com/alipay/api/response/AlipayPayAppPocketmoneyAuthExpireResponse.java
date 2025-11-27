package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.app.pocketmoney.auth.expire response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-09 11:07:29
 */
public class AlipayPayAppPocketmoneyAuthExpireResponse extends AlipayResponse {

	private static final long serialVersionUID = 6781438642558947952L;

	/** 
	 * 解除结果
	 */
	@ApiField("state")
	private String state;

	public void setState(String state) {
		this.state = state;
	}
	public String getState( ) {
		return this.state;
	}

}
