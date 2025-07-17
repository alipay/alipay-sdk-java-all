package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isportal.loginencryptjwt.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-08 16:35:19
 */
public class AlipayIserviceIsportalLoginencryptjwtQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8552669254168937335L;

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
