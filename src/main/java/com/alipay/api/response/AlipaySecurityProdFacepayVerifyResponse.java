package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.facepay.verify response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySecurityProdFacepayVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8763855649271747884L;

	/** 
	 * 安全码。当人脸认证成功时，支付宝返回此项参数，商户使用此token发起后续支付流程
	 */
	@ApiField("ftoken")
	private String ftoken;

	public void setFtoken(String ftoken) {
		this.ftoken = ftoken;
	}
	public String getFtoken( ) {
		return this.ftoken;
	}

}
