package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.autoinsprod.common.notify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 20:07:38
 */
public class AlipayInsAutoAutoinsprodCommonNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8337912362785732496L;

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
