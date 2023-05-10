package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.quotation.quotetrade.nimitzdata.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 14:57:03
 */
public class AlipayFinanceQuotationQuotetradeNimitzdataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2482453641783257487L;

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
