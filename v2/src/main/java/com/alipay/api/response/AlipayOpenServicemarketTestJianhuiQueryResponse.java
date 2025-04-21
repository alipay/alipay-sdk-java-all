package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.servicemarket.test.jianhui.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-10 11:19:05
 */
public class AlipayOpenServicemarketTestJianhuiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1126251685463831958L;

	/** 
	 * 接口请求成功
	 */
	@ApiField("message")
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

}
