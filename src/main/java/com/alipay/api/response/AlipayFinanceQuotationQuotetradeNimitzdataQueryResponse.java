package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.quotation.quotetrade.nimitzdata.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 10:46:52
 */
public class AlipayFinanceQuotationQuotetradeNimitzdataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4269626661313631185L;

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
