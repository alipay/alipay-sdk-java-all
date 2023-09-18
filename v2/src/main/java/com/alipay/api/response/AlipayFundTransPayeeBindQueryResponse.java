package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.payee.bind.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 16:18:31
 */
public class AlipayFundTransPayeeBindQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4772899547547728695L;

	/** 
	 * 是否绑定收款账号。true：已绑定；false：未绑定
	 */
	@ApiField("bind")
	private String bind;

	public void setBind(String bind) {
		this.bind = bind;
	}
	public String getBind( ) {
		return this.bind;
	}

}
