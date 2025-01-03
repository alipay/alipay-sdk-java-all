package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.acceptance.access.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-25 11:31:10
 */
public class ZhimaCreditEpAcceptanceAccessQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3826978138883633369L;

	/** 
	 * 芝麻企业信用数据访问令牌
	 */
	@ApiField("access_token")
	private String accessToken;

	/** 
	 * 用户接入企业信用受理台服务H5页面地址
	 */
	@ApiField("access_url")
	private String accessUrl;

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getAccessToken( ) {
		return this.accessToken;
	}

	public void setAccessUrl(String accessUrl) {
		this.accessUrl = accessUrl;
	}
	public String getAccessUrl( ) {
		return this.accessUrl;
	}

}
