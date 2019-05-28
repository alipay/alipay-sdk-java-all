package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.alideviceinfo.offlinecode.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-26 17:57:15
 */
public class AlipayCommerceAlideviceinfoOfflinecodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7176287654484114435L;

	/** 
	 * 机具统一ID
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/** 
	 * 离线支付token
	 */
	@ApiField("token")
	private String token;

	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}
	public String getBizTid( ) {
		return this.bizTid;
	}

	public void setToken(String token) {
		this.token = token;
	}
	public String getToken( ) {
		return this.token;
	}

}
