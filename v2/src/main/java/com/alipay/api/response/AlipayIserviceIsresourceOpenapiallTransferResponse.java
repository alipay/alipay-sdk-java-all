package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isresource.openapiall.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-08 16:37:25
 */
public class AlipayIserviceIsresourceOpenapiallTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 6375826919478959448L;

	/** 
	 * 序列化之后返回参数
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
