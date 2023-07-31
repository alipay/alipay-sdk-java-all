package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isportal.permissioncheck.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-10 10:04:54
 */
public class AlipayIserviceIsportalPermissioncheckQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5446779359119216833L;

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
