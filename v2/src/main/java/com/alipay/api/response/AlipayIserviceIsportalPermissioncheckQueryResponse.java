package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isportal.permissioncheck.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-13 20:27:25
 */
public class AlipayIserviceIsportalPermissioncheckQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8854364337354979637L;

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
