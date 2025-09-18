package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isportal.logindigest.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-08 16:37:25
 */
public class AlipayIserviceIsportalLogindigestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3173667714377123335L;

	/** 
	 * 登录摘要
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
