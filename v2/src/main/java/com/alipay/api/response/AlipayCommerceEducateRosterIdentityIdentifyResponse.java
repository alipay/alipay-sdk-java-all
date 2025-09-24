package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.roster.identity.identify response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-20 17:17:25
 */
public class AlipayCommerceEducateRosterIdentityIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7748553314251276586L;

	/** 
	 * 服务商接口信息
	 */
	@ApiField("isv_msg")
	private String isvMsg;

	public void setIsvMsg(String isvMsg) {
		this.isvMsg = isvMsg;
	}
	public String getIsvMsg( ) {
		return this.isvMsg;
	}

}
