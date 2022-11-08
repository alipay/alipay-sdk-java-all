package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.zcardprod.user.bind response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-24 14:07:05
 */
public class AlipayFundZcardprodUserBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 4248135743443835517L;

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
