package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.autoinsprod.common.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-19 17:15:46
 */
public class AlipayInsAutoAutoinsprodCommonConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 8649422636217522614L;

	/** 
	 * 具体内容按照业务类型对应的key值传输
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
