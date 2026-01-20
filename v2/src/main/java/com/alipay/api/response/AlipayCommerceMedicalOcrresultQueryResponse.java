package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.ocrresult.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-15 12:57:41
 */
public class AlipayCommerceMedicalOcrresultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2682693843119995296L;

	/** 
	 * 处理结果
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
