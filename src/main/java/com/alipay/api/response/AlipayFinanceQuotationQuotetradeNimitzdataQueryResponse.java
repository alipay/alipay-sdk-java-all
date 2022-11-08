package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.quotation.quotetrade.nimitzdata.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-19 21:16:53
 */
public class AlipayFinanceQuotationQuotetradeNimitzdataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3257524773749652618L;

	/** 
	 * Nimitz数据返回结果，Json结构
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
