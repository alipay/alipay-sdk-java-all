package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isresource.openapi.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-25 16:22:27
 */
public class AlipayIserviceIsresourceOpenapiTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 4715783498389351728L;

	/** 
	 * facade接口的出参
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
