package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isportal.loginencryptjwt.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 10:47:36
 */
public class AlipayIserviceIsportalLoginencryptjwtQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7344632135918452694L;

	/** 
	 * 加密的登录态jwt信息
	 */
	@ApiField("biz_data")
	private String bizData;

	public void setBizData(String bizData) {
		this.bizData = bizData;
	}
	public String getBizData( ) {
		return this.bizData;
	}

}
