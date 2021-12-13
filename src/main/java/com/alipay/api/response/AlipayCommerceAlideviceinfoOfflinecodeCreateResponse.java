package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.alideviceinfo.offlinecode.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 10:41:58
 */
public class AlipayCommerceAlideviceinfoOfflinecodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8645399658854882827L;

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
