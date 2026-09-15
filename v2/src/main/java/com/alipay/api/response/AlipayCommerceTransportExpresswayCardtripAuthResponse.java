package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.expressway.cardtrip.auth response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-25 17:57:49
 */
public class AlipayCommerceTransportExpresswayCardtripAuthResponse extends AlipayResponse {

	private static final long serialVersionUID = 5765847778284586689L;

	/** 
	 * 支付宝授权号
	 */
	@ApiField("auth_biz_no")
	private String authBizNo;

	/** 
	 * 资格校验完成后返回认证token
	 */
	@ApiField("biz_token")
	private String bizToken;

	public void setAuthBizNo(String authBizNo) {
		this.authBizNo = authBizNo;
	}
	public String getAuthBizNo( ) {
		return this.authBizNo;
	}

	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}
	public String getBizToken( ) {
		return this.bizToken;
	}

}
