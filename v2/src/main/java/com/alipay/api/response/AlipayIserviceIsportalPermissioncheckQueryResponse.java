package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isportal.permissioncheck.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:31:42
 */
public class AlipayIserviceIsportalPermissioncheckQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8691924583155216293L;

	/** 
	 * 鉴权结果
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
