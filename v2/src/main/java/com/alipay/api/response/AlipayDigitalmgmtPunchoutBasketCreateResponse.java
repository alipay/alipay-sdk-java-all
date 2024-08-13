package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.punchout.basket.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:46:43
 */
public class AlipayDigitalmgmtPunchoutBasketCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3625753841929435956L;

	/** 
	 * 合并成功后跳转链接
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	public String getRedirectUrl( ) {
		return this.redirectUrl;
	}

}
