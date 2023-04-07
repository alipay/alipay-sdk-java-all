package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.quotation.quotetrade.nimitzdata.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 13:26:47
 */
public class AlipayFinanceQuotationQuotetradeNimitzdataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7581283998224997314L;

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
