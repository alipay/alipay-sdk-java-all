package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isportal.encrypt.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 10:47:37
 */
public class AlipayIserviceIsportalEncryptQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4131945665849133174L;

	/** 
	 * 公钥
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
