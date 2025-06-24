package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.quotation.quotetradeopen.nimitzdata.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-16 11:41:37
 */
public class AlipayFinanceQuotationQuotetradeopenNimitzdataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5189817345161713893L;

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
