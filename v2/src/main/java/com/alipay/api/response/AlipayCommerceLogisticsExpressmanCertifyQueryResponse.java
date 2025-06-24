package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.expressman.certify.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-30 09:52:27
 */
public class AlipayCommerceLogisticsExpressmanCertifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8829394342753849446L;

	/** 
	 * true 开通快递员之家
false 未开通快递员之家
	 */
	@ApiField("certify")
	private Boolean certify;

	/** 
	 * 未认证前端跳转链接
	 */
	@ApiField("certify_url")
	private String certifyUrl;

	public void setCertify(Boolean certify) {
		this.certify = certify;
	}
	public Boolean getCertify( ) {
		return this.certify;
	}

	public void setCertifyUrl(String certifyUrl) {
		this.certifyUrl = certifyUrl;
	}
	public String getCertifyUrl( ) {
		return this.certifyUrl;
	}

}
