package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.zcardprod.user.bind response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-18 10:52:00
 */
public class AlipayFundZcardprodUserBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 6749273566217173968L;

	/** 
	 * 邀请密钥
	 */
	@ApiField("bind_token")
	private String bindToken;

	public void setBindToken(String bindToken) {
		this.bindToken = bindToken;
	}
	public String getBindToken( ) {
		return this.bindToken;
	}

}
