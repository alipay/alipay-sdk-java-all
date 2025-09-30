package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.quotation.quotetrade.symbols.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:07:39
 */
public class AlipayFinanceQuotationQuotetradeSymbolsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3533624755136418172L;

	/** 
	 * 股票的唯一代码：symbol=code.market
	 */
	@ApiListField("data")
	@ApiField("string")
	private List<String> data;

	public void setData(List<String> data) {
		this.data = data;
	}
	public List<String> getData( ) {
		return this.data;
	}

}
