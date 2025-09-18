package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.quotation.quotetradeopen.symbols.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-11 15:02:27
 */
public class AlipayFinanceQuotationQuotetradeopenSymbolsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2542349118867618693L;

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
