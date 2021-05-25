package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.payee.bind.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-05-25 11:56:25
 */
public class AlipayFundTransPayeeBindQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3627187797941469873L;

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
